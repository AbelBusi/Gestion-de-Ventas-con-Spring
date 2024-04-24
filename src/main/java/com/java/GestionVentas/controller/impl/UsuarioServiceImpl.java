package com.java.GestionVentas.controller.impl;

import com.java.GestionVentas.controller.repository.IUsuarioRepository;
import com.java.GestionVentas.controller.service.IUsuarioService;
import com.java.GestionVentas.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> mostrarUsuarios(Usuario usuario) {
        return null;
    }

    @Override
    public Usuario mostrarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public Optional<Usuario> idUsuario(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Usuario> findByCorreoUsuario(String emailUsuario) {
        return usuarioRepository.findByCorreoUsuario(emailUsuario);
    }

    @Override
    public Optional<Usuario> findByPasswordUsuario(String passUsuario) {
        return usuarioRepository.findByPasswordUsuario(passUsuario);
    }
}
