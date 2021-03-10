package com.dcatech.seguridad.services.controller;

import com.dcatech.security.commons.models.entity.Role;
import com.dcatech.seguridad.services.exception.exceptions.MasterCreateException;
import com.dcatech.seguridad.services.exception.exceptions.MasterDeleteException;
import com.dcatech.seguridad.services.exception.exceptions.MasterEditException;
import com.dcatech.seguridad.services.exception.exceptions.MasterResourceNotFoundException;
import com.dcatech.seguridad.services.models.services.IRoleServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
@Api(tags = {"Seguridad"}, protocols = "http, https", consumes = "application/json", produces = "application/json")
public class RoleController {

    @Autowired
    private IRoleServices roleServices;

    @ApiOperation(value = "Listar roles", notes = "<br>Retorna una lista de todos los roles registrados en la aplicación"
            , response = Role[].class, responseContainer = "List", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Role[].class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @GetMapping("/list")
    public List<Role> findRoles(){
        return roleServices.findRoles();
    }

    @ApiOperation(value = "Buscar Roles", notes = "<br>Retorna el rol filtrado por el nombre."
            , response = Role.class, produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Role.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @GetMapping("/role-name/{name}")
    public Role findRole(@PathVariable String name) throws MasterResourceNotFoundException {
        return roleServices.findByName(name);
    }

    @ApiOperation(value = "Buscar Roles", notes = "<br>Retorna el rol filtrado por el ID."
            , response = Role.class, produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Role.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @GetMapping("/role-id/{id}")
    public Role findRole(@PathVariable Long id) throws MasterResourceNotFoundException {
        return roleServices.findById(id);
    }

    @ApiOperation(value = "Crear Roles", notes = "<br>Permite la creación de los roles de la aplicación."
            , response = Role.class, produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Role.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @PostMapping("/create")
    public Role create(@RequestBody Role role) throws MasterCreateException {
        return roleServices.create(role);
    }

    @ApiOperation(value = "Editar Roles", notes = "<br>Permite la edición de los roles de la aplicación."
            , response = Role.class, produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Role.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @PutMapping("/edit/{id}")
    public Role edit(@RequestBody Role role, @PathVariable Long id) throws MasterResourceNotFoundException, MasterEditException {
        return roleServices.edit(role, id);
    }

    @ApiOperation(value = "Eliminar Roles", notes = "<br>Permite eliminar los roles de la aplicación."
            , response = String.class, produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa"),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) throws MasterDeleteException {
        roleServices.delete(id);
    }


}
