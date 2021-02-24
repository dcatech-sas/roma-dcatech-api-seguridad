package com.dcatech.seguridad.services.models.dao;

import com.dcatech.security.commons.models.entity.Menu;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MenuDao extends CrudRepository<Menu,Long> {

    List<Menu> findByParentMenu_Id(Long id);
    List<Menu> findByParentMenu_IdNotNull();
}
