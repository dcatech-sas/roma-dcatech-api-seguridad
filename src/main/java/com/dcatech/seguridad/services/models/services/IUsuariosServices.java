package com.dcatech.seguridad.services.models.services;

import com.dcatech.security.commons.models.entity.Usuario;
import com.dcatech.seguridad.services.exception.exceptions.MasterDeleteException;
import com.dcatech.seguridad.services.exception.exceptions.MasterResourceNotFoundException;


import java.util.List;

public interface IUsuariosServices {

    List<Usuario> findUsers();
    Usuario findByUsername(String username);
    Usuario create(Usuario usuario) throws Exception;
    Usuario edit(Usuario usuario, Long id) throws MasterResourceNotFoundException;
    void delete(Long id) throws MasterDeleteException;



}
