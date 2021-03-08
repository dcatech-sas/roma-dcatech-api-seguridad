package com.dcatech.seguridad.services.controller;

import com.dcatech.security.commons.models.entity.Menu;
import com.dcatech.seguridad.services.controller.dto.LvMenuDto;
import com.dcatech.seguridad.services.controller.mapper.LvMenuMapper;
import com.dcatech.seguridad.services.exception.exceptions.MasterCreateException;
import com.dcatech.seguridad.services.exception.exceptions.MasterDeleteException;
import com.dcatech.seguridad.services.exception.exceptions.MasterEditException;
import com.dcatech.seguridad.services.exception.exceptions.MasterResourceNotFoundException;
import com.dcatech.seguridad.services.models.services.IMenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
@Api(tags = {"Seguridad"}, protocols = "http, https", consumes = "application/json", produces = "application/json")
public class MenuController {

    @Autowired
    private IMenuService menuService;


    @ApiOperation(value = "Menú por usuario", notes = "<br>Retorna una lista de todos los menus filtrado por usuario"
            , response = Menu[].class, responseContainer = "List", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Menu[].class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @GetMapping("/list/{username}")
    public List<Menu> findMenuByUsername1(@PathVariable String username) throws MasterResourceNotFoundException {
        return menuService.findMenuByUserRol(username);
    }

    @ApiOperation(value = "Listar menú", notes = "<br>Retorna una lista de todos los menus registrados en la aplicación"
            , response = Menu[].class, responseContainer = "List", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Menu[].class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @GetMapping("/list")
    public List<Menu> getMenus(){
        return menuService.findMenu();
    }

    @ApiOperation(value = "Submenú", notes = "<br>Retorna una lista de todos los submenus registrados en la aplicación filtrado por el menú padre"
            , response = Menu[].class, responseContainer = "List", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Menu[].class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @GetMapping("/menu/{submenu}")
    public List<Menu> getMenus(@PathVariable Long submenu){
        return menuService.findMenuSubMenu(submenu);
    }

    @ApiOperation(value = "Submenú", notes = "<br>Retorna una lista de todos los submenus registrados en la aplicación."
            , response = Menu[].class, responseContainer = "List", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Menu[].class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @GetMapping("/submenu")
    public List<Menu> getSubMenus(){
        return menuService.findMenuSubMenu();
    }

    @ApiOperation(value = "Crear menú", notes = "<br>Permite el registro de las diferentes opciones de menú, submenu y accesos de la aplicación."
            , response = Menu.class, produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Menu.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @PostMapping("/create")
    public Menu create(@RequestBody Menu menu) throws MasterCreateException {
        return menuService.create(menu);
    }

    @ApiOperation(value = "Editar menú", notes = "<br>Permite la edición de las diferentes opciones de menú, submenu y accesos de la aplicación."
            , response = Menu.class, produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Menu.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @PutMapping("/edit/{id}")
    public Menu edit(@RequestBody Menu menu, @PathVariable Long id) throws MasterResourceNotFoundException, MasterEditException {
        return menuService.edit(menu,id);
    }

    @ApiOperation(value = "Eliminar menú", notes = "<br>Permite eliminar las diferentes opciones de menú, submenu y accesos de la aplicación."
            , response = Menu.class, produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Menu.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) throws MasterDeleteException {
        menuService.delete(id);
    }
}
