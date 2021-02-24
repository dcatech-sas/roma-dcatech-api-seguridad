package com.dcatech.seguridad.services.controller;

import com.dcatech.security.commons.models.entity.Menu;
import com.dcatech.seguridad.services.exception.exceptions.MasterCreateException;
import com.dcatech.seguridad.services.exception.exceptions.MasterDeleteException;
import com.dcatech.seguridad.services.exception.exceptions.MasterEditException;
import com.dcatech.seguridad.services.exception.exceptions.MasterResourceNotFoundException;
import com.dcatech.seguridad.services.models.services.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private IMenuService menuService;

    @GetMapping("/list")
    public List<Menu> getMenus(){
        return menuService.findMenu();
    }

    @GetMapping("/menu/{submenu}")
    public List<Menu> getMenus(@PathVariable Long submenu){
        return menuService.findMenuSubMenu(submenu);
    }

    @GetMapping("/submenu")
    public List<Menu> getSubMenus(){
        return menuService.findMenuSubMenu();
    }

    @PostMapping("/create")
    public Menu create(@RequestBody Menu menu) throws MasterCreateException {
        return menuService.create(menu);
    }

    @PutMapping("/edit/{id}")
    public Menu edit(@RequestBody Menu menu, @PathVariable Long id) throws MasterResourceNotFoundException, MasterEditException {
        return menuService.edit(menu,id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) throws MasterDeleteException {
        menuService.delete(id);
    }
}
