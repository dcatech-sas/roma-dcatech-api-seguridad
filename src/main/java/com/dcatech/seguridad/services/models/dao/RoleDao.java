package com.dcatech.seguridad.services.models.dao;


import com.dcatech.security.commons.models.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, Long> {
    Role findByNombre(String nombre);
}
