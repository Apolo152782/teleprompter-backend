package com.appmovil.teleprompter.repositorio;

import com.appmovil.teleprompter.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}