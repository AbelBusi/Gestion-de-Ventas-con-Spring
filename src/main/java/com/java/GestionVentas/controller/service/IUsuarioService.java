package com.java.GestionVentas.controller.service;

import com.java.GestionVentas.model.Usuario;
import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    List<Usuario> mostrarUsuarios(Usuario usuario);

    Usuario mostrarUsuario(Usuario usuario);

    Optional<Usuario> idUsuario (int id);

    Optional<Usuario> findByCorreoUsuario(String emailUsuario);
    Optional<Usuario> findByPasswordUsuario(String passUsuario);

}
