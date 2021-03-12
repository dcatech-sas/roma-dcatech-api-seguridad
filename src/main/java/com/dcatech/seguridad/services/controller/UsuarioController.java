package com.dcatech.seguridad.services.controller;

import com.dcatech.security.commons.models.entity.Usuario;
import com.dcatech.seguridad.services.exception.exceptions.MasterCreateException;
import com.dcatech.seguridad.services.exception.exceptions.MasterDeleteException;
import com.dcatech.seguridad.services.exception.exceptions.MasterEditException;
import com.dcatech.seguridad.services.exception.exceptions.MasterResourceNotFoundException;
import com.dcatech.seguridad.services.models.services.IUsuariosServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
@Api(tags = {"Seguridad"}, protocols = "http, https", consumes = "application/json", produces = "application/json")
public class UsuarioController {

    @Autowired
    private IUsuariosServices usuariosServices;

    @ApiOperation(value = "Listar usuarios", notes = "<br>Retorna una lista de todos los usuarios registrados en la aplicación"
            , response = Usuario[].class, responseContainer = "List", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Usuario[].class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @GetMapping("/list")
    public List<Usuario>  getUsuarios(){
        return usuariosServices.findUsers();
    }

    @ApiOperation(value = "Buscar usuario por identificador", notes = "<br>Retorna el usuario filtrado por el username."
            , response = Usuario.class, produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Usuario.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @GetMapping("/find-username/{username}")
    public Usuario getUsuarios(@PathVariable String username){
        return usuariosServices.findByUsername(username);
    }

    @ApiOperation(value = "Registrar usuarios", notes = "<br>Permite la creación del usuario dentro del sistema,"
            , response = Usuario.class, responseContainer = "List", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Usuario.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @PostMapping("/create")
    public Usuario create(@Valid @RequestBody Usuario usuario, BindingResult result) throws Exception {
        List<String> errores = new ArrayList<>();

        if(result.hasErrors()){
            errores = result.getFieldErrors()
                    .stream()
                    .map(err -> {
                        return String.format("El campo '%s' %s", err.getField(),err.getDefaultMessage());
                    }).collect(Collectors.toList());
        }
        try {
            return usuariosServices.create(usuario);
        }catch (Exception e){
            throw new MasterCreateException(errores.toString());
        }
    }

    @ApiOperation(value = "Editar usuarios", notes = "<br>Permite la edición del usuario dentro del sistema,"
            , response = Usuario.class, responseContainer = "List", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa", response = Usuario.class),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @PutMapping("/update/{id}")
    public Usuario edit(@Valid @RequestBody Usuario usuario,  BindingResult result, @PathVariable Long id) throws MasterResourceNotFoundException, MasterEditException {
        List<String> errores = new ArrayList<>();

        if(result.hasErrors()){
            errores = result.getFieldErrors()
                    .stream()
                    .map(err -> {
                        return String.format("El campo '%s' %s", err.getField(),err.getDefaultMessage());
                    }).collect(Collectors.toList());
        }

        try {
            return usuariosServices.edit(usuario, id);
        }catch (Exception e){
            throw new MasterEditException(errores.toString());
        }

    }

    @ApiOperation(value = "Eliminar usuarios", notes = "<br>Permite la eliminación del usuario dentro del sistema."
            , response = Usuario.class, responseContainer = "List", produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Operación Exitosa"),
            @ApiResponse(code = 401, message = "No posees  autorización"),
            @ApiResponse(code = 403, message = "Esta operación no esta permitida"),
            @ApiResponse(code = 404, message = "Recurso no encotrado"),
            @ApiResponse(code = 500, message = "Error del sistema")
    })
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) throws MasterDeleteException {
        usuariosServices.delete(id);
    }


}
