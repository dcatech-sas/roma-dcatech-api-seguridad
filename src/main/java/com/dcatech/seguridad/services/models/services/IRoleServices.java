package com.dcatech.seguridad.services.models.services;

import com.dcatech.security.commons.models.entity.Role;
import com.dcatech.seguridad.services.exception.exceptions.MasterCreateException;
import com.dcatech.seguridad.services.exception.exceptions.MasterDeleteException;
import com.dcatech.seguridad.services.exception.exceptions.MasterEditException;
import com.dcatech.seguridad.services.exception.exceptions.MasterResourceNotFoundException;

import java.util.List;

public interface IRoleServices {

    List<Role> findRoles();
    Role findById(Long id) throws MasterResourceNotFoundException;
    Role findByName(String name) throws MasterResourceNotFoundException;
    Role create(Role role) throws MasterCreateException;
    Role edit(Role role, Long id) throws MasterResourceNotFoundException, MasterEditException;
    void delete(Long id) throws MasterDeleteException;
}
