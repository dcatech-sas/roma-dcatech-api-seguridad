package com.dcatech.seguridad.services.models.services.implement;

import com.dcatech.security.commons.models.entity.Menu;
import com.dcatech.security.commons.models.entity.MenuRole;
import com.dcatech.security.commons.models.entity.Role;
import com.dcatech.security.commons.models.entity.Usuario;
import com.dcatech.seguridad.services.exception.exceptions.MasterCreateException;
import com.dcatech.seguridad.services.exception.exceptions.MasterDeleteException;
import com.dcatech.seguridad.services.exception.exceptions.MasterEditException;
import com.dcatech.seguridad.services.exception.exceptions.MasterResourceNotFoundException;
import com.dcatech.seguridad.services.models.dao.MenuDao;
import com.dcatech.seguridad.services.models.dao.MenuRoleDao;
import com.dcatech.seguridad.services.models.dao.UsuarioDao;
import com.dcatech.seguridad.services.models.services.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class MenuServices implements IMenuService {

    @Autowired
    private MenuDao menuDao;

    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private MenuRoleDao menuRoleDao;

    @Override
    @Transactional(readOnly = true)
    public List<Menu> findMenuSubMenu(Long id) {
        return menuDao.findByParentMenu_Id(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Menu> findMenuSubMenu() {
        return menuDao.findByParentMenu_IdNotNull();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Menu> findMenu() {
        return menuDao.findAllByParentMenuIsNull();
    }


    private Boolean isGranteedAccess(List<Role> userRoles, Menu menu){

        Set<Long> rolesUserName = userRoles
                .stream().map(Role::getId)
                .collect(Collectors.toSet());

        Long existe = menu.getMenuRoles().stream().filter(opt ->
                rolesUserName.contains(opt.getRoleId().getId())
                        && opt.getOptSelect().equals(true)).count();

        return existe != 0 ? true : false;

    }


    private Menu getSubMenu(List<Role> userRoles, Menu lvMenus){
        lvMenus.setSubmenu(lvMenus.getSubmenu().stream().filter(
                subMenuItem -> isGranteedAccess(userRoles, subMenuItem)
        ).collect(Collectors.toList()));

        return lvMenus;
    }

    @Override
    public List<Menu> findMenuByUserRol(String username) throws MasterResourceNotFoundException {

        Usuario usuario = usuarioDao.findByUsername(username);
        if (usuario == null) {
            throw new MasterResourceNotFoundException("El usuario " + username + " no esta registrado.");
        }

        List<Menu> menus = menuDao.findAllByParentMenuIsNull();

        List<Menu> menuResultado = menus.stream()
                .filter(menuItem -> isGranteedAccess(usuario.getRoles(), menuItem))
                .map(menuItem -> getSubMenu(usuario.getRoles(), menuItem))
                .collect(Collectors.toList());

        return menuResultado;
    }

    @Override
    @Transactional(propagation = Propagation.NESTED)
    public Menu create(Menu menu) throws MasterCreateException {
        try {

            Menu newMenu;
            List<MenuRole> menuRoles;

            newMenu = menuDao.save(menu);

            Menu finalNewMenu = newMenu;
            menuRoles = menu.getMenuRoles()
                    .stream()
                    .map(m -> {
                        m.setMenuId(finalNewMenu);
                        return menuRoleDao.save(m);
                    }).collect(Collectors.toList());

            newMenu.setMenuRoles(menuRoles);

            return menuDao.save(newMenu);

        }catch (Exception e){
            throw new MasterCreateException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Menu edit(Menu menu, Long id) throws MasterResourceNotFoundException, MasterEditException {
        Menu buscarMenu = menuDao.findById(id).orElse(null);

        if(buscarMenu==null){
            throw new MasterResourceNotFoundException();
        }

        buscarMenu.setDescription(menu.getDescription());
        buscarMenu.setIconName(menu.getIconName());
        buscarMenu.setIconType(menu.getIconType());
        buscarMenu.setMenuRoles(menu.getMenuRoles());
        buscarMenu.setLabel(menu.getLabel());
        buscarMenu.setOrden(menu.getOrden());
        buscarMenu.setParentMenu(menu.getParentMenu());
        buscarMenu.setVisible(menu.getVisible());
        buscarMenu.setRouterLink(menu.getRouterLink());
        buscarMenu.setDetails(menu.getDetails());

        try {
            return menuDao.save(buscarMenu);
        }catch (Exception e){
            throw new MasterEditException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public void delete(Long id) throws MasterDeleteException {
        try{
            menuDao.deleteById(id);
        }catch (Exception e){
            throw new MasterDeleteException(e.getMessage());
        }
    }
}
