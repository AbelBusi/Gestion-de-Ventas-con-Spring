package com.java.GestionVentas.controller.repository;

import com.java.GestionVentas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {

    //Obtener el correo del usuario
    Optional<Usuario> findByCorreoUsuario(String emailUsuario);

    //Obtener el password del usuario
    Optional<Usuario> findByPasswordUsuario(String passUsuario);

}
