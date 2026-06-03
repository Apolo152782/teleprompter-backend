package com.appmovil.teleprompter.controlador;

import com.appmovil.teleprompter.entidad.Usuario;
import com.appmovil.teleprompter.servicio.UsuarioServicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")

public class UsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping
public List<Usuario> listarUsuarios() {
    return usuarioServicio.listarUsuarios();
}

    @PostMapping
    public Usuario guardarUsuario(@RequestBody Usuario usuario) {
        return usuarioServicio.guardarUsuario(usuario);
    }
}