package com.dcatech.seguridad.services.controller;

import com.dcatech.security.commons.models.entity.Usuario;
import com.dcatech.seguridad.services.exception.exceptions.MasterDeleteException;
import com.dcatech.seguridad.services.exception.exceptions.MasterResourceNotFoundException;
import com.dcatech.seguridad.services.models.services.IUsuariosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuariosServices usuariosServices;

    @GetMapping("/list")
    public List<Usuario>  getUsuarios(){
        return usuariosServices.findUsers();
    }

    @GetMapping("/find-username/{username}")
    public Usuario getUsuarios(@PathVariable String username){
        return usuariosServices.findByUsername(username);
    }

    @PostMapping("/create")
    public Usuario create(@RequestBody Usuario usuario) throws Exception {
        return usuariosServices.create(usuario);
    }

    @PutMapping("/update/{id}")
    public Usuario edit(@RequestBody Usuario usuario, @PathVariable Long id) throws MasterResourceNotFoundException {
        return usuariosServices.edit(usuario, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) throws MasterDeleteException {
        usuariosServices.delete(id);
    }


}
