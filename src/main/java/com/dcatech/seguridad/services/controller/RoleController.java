package com.dcatech.seguridad.services.controller;

import com.dcatech.security.commons.models.entity.Role;
import com.dcatech.seguridad.services.exception.exceptions.MasterCreateException;
import com.dcatech.seguridad.services.exception.exceptions.MasterDeleteException;
import com.dcatech.seguridad.services.exception.exceptions.MasterEditException;
import com.dcatech.seguridad.services.exception.exceptions.MasterResourceNotFoundException;
import com.dcatech.seguridad.services.models.services.IRoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private IRoleServices roleServices;

    @GetMapping("/list")
    public List<Role> findRoles(){
        return roleServices.findRoles();
    }

    @GetMapping("/role-name/{name}")
    public Role findRole(@PathVariable String name) throws MasterResourceNotFoundException {
        return roleServices.findByName(name);
    }

    @GetMapping("/role-id/{id}")
    public Role findRole(@PathVariable Long id) throws MasterResourceNotFoundException {
        return roleServices.findById(id);
    }

    @PostMapping("/create")
    public Role create(@RequestBody Role role) throws MasterCreateException {
        return roleServices.create(role);
    }

    @PutMapping("/edit/{id}")
    public Role edit(@RequestBody Role role, @PathVariable Long id) throws MasterResourceNotFoundException, MasterEditException {
        return roleServices.edit(role, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) throws MasterDeleteException {
        roleServices.delete(id);
    }


}
