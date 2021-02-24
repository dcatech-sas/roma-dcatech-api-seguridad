package com.dcatech.seguridad.services.models.dao;

import com.dcatech.security.commons.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDao extends CrudRepository<Usuario, Long> {

    Usuario findByUsername(@Param("username") String username);

}
