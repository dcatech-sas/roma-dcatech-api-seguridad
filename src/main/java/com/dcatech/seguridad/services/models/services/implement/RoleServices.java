package com.dcatech.seguridad.services.models.services.implement;

import com.dcatech.security.commons.models.entity.Role;
import com.dcatech.seguridad.services.exception.exceptions.MasterCreateException;
import com.dcatech.seguridad.services.exception.exceptions.MasterDeleteException;
import com.dcatech.seguridad.services.exception.exceptions.MasterEditException;
import com.dcatech.seguridad.services.exception.exceptions.MasterResourceNotFoundException;
import com.dcatech.seguridad.services.models.dao.RoleDao;
import com.dcatech.seguridad.services.models.services.IRoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServices implements IRoleServices {

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> findRoles() {
        return (List<Role>)roleDao.findAll();
    }

    @Override
    public Role findById(Long id) throws MasterResourceNotFoundException {
        Role role = roleDao.findById(id).orElse(null);

        if(role == null){
            throw new MasterResourceNotFoundException();
        }

        return role;
    }

    @Override
    public Role findByName(String name) throws MasterResourceNotFoundException {
        Role role = roleDao.findByNombre(name);

        if(role == null){
            throw new MasterResourceNotFoundException();
        }

        return role;
    }

    @Override
    public Role create(Role role) throws MasterCreateException {
        try {
            return roleDao.save(role);
        }catch (Exception e){
            throw new MasterCreateException(e.getMessage());
        }
    }

    @Override
    public Role edit(Role role, Long id) throws MasterResourceNotFoundException, MasterEditException {
        Role editRole = roleDao.findById(id).orElse(null);

        if(editRole==null){
            throw new MasterResourceNotFoundException();
        }

        editRole.setNombre(role.getNombre());

        try {
            return roleDao.save(editRole);
        }catch (Exception e){
            throw new MasterEditException(e.getMessage());
        }
    }

    @Override
    public void delete(Long id) throws MasterDeleteException {
        try{
            roleDao.deleteById(id);
        }catch (Exception e){
            throw new MasterDeleteException(e.getMessage());
        }
    }
}
