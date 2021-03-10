package com.dcatech.seguridad.services.models.dao;

import com.dcatech.security.commons.models.entity.MenuRole;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface MenuRoleDao extends CrudRepository<MenuRole, Long> {
    List<MenuRole> findByRoleId_Id(Long id);
}
