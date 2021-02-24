package com.dcatech.seguridad.services.models.services.implement;

import com.dcatech.security.commons.models.entity.Menu;
import com.dcatech.seguridad.services.exception.exceptions.MasterCreateException;
import com.dcatech.seguridad.services.exception.exceptions.MasterDeleteException;
import com.dcatech.seguridad.services.exception.exceptions.MasterEditException;
import com.dcatech.seguridad.services.exception.exceptions.MasterResourceNotFoundException;
import com.dcatech.seguridad.services.models.dao.MenuDao;
import com.dcatech.seguridad.services.models.services.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuServices implements IMenuService {

    @Autowired
    private MenuDao menuDao;

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
        return (List<Menu>)menuDao.findAll();
    }

    @Override
    @Transactional
    public Menu create(Menu menu) throws MasterCreateException {
        try {
            return menuDao.save(menu);
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
        buscarMenu.setIcon(menu.getIcon());
        buscarMenu.setMenuRoles(menu.getMenuRoles());
        buscarMenu.setName(menu.getName());
        buscarMenu.setOrden(menu.getOrden());
        buscarMenu.setParentMenu(menu.getParentMenu());
        buscarMenu.setStatus(menu.getStatus());
        buscarMenu.setUrl(menu.getUrl());

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
