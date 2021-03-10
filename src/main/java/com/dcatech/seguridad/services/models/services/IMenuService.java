package com.dcatech.seguridad.services.models.services;

import com.dcatech.security.commons.models.entity.Menu;
import com.dcatech.seguridad.services.exception.exceptions.MasterCreateException;
import com.dcatech.seguridad.services.exception.exceptions.MasterDeleteException;
import com.dcatech.seguridad.services.exception.exceptions.MasterEditException;
import com.dcatech.seguridad.services.exception.exceptions.MasterResourceNotFoundException;

import java.util.List;

public interface IMenuService {

    
    List<Menu> findMenuSubMenu(Long id);
    List<Menu> findMenuSubMenu();
    List<Menu> findMenu();
    Menu create(Menu menu) throws MasterCreateException;
    Menu edit(Menu menu, Long id) throws MasterResourceNotFoundException, MasterEditException;
    void delete(Long id) throws MasterDeleteException;
}
