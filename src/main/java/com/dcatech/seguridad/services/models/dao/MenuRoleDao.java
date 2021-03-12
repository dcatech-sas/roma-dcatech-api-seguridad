package com.dcatech.seguridad.services.models.dao;

import com.dcatech.security.commons.models.entity.MenuRole;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface MenuRoleDao extends CrudRepository<MenuRole, Long> {
    List<MenuRole> findByRoleId_Id(Long id);
    List<MenuRole> findByRoleId_IdAndOptCreate(Long id, Boolean status);
    List<MenuRole> findByRoleId_IdAndOptDelete(Long id, Boolean status);
    List<MenuRole> findByRoleId_IdAndOptUpdate(Long id, Boolean status);
}
