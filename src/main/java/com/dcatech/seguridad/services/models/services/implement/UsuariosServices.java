package com.dcatech.seguridad.services.models.services.implement;

import com.dcatech.security.commons.models.entity.Usuario;
import com.dcatech.seguridad.services.exception.exceptions.MasterCreateException;
import com.dcatech.seguridad.services.exception.exceptions.MasterDeleteException;
import com.dcatech.seguridad.services.exception.exceptions.MasterResourceNotFoundException;
import com.dcatech.seguridad.services.models.dao.UsuarioDao;
import com.dcatech.seguridad.services.models.services.IUsuariosServices;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosServices implements IUsuariosServices {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public List<Usuario> findUsers() {
        return (List<Usuario>)usuarioDao.findAll();
    }

    @SneakyThrows
    @Override
    public Usuario findByUsername(String username) {

        Usuario usuario = usuarioDao.findByUsername(username);

        if (usuario == null){
            throw new MasterResourceNotFoundException();
        }

        return usuario;
    }

    @Override
    public Usuario create(Usuario usuario) throws Exception {
        try {
            return usuarioDao.save(usuario);
        }catch (Exception e){
            throw new MasterCreateException(e.getMessage());
        }

    }

    @Override
    public Usuario edit(Usuario usuario, Long id) throws MasterResourceNotFoundException {
        Usuario buscar = usuarioDao.findById(id).orElse(null);

        if(buscar == null){
            throw new MasterResourceNotFoundException();
        }

        buscar.setUsername(usuario.getUsername());
        buscar.setEmail(usuario.getPassword());
        buscar.setIntentos(usuario.getIntentos());
        buscar.setRoles(usuario.getRoles());
        buscar.setEnabled(usuario.getEnabled());
        buscar.setNombre(usuario.getNombre());
        buscar.setApellido(usuario.getApellido());
        buscar.setEmail(usuario.getEmail());

        return usuarioDao.save(buscar);
    }

    @Override
    public void delete(Long id) throws MasterDeleteException {

        try{
            usuarioDao.deleteById(id);
        }catch (Exception e){
            throw new MasterDeleteException(e.getMessage());
        }

    }
}
