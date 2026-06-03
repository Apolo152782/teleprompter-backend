package com.appmovil.teleprompter.servicio;

import com.appmovil.teleprompter.entidad.Usuario;
import com.appmovil.teleprompter.repositorio.UsuarioRepositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public List<Usuario> listarUsuarios() {
    return usuarioRepositorio.findAll();
}

    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }
}