package com.appmovil.teleprompter.servicio;

import com.appmovil.teleprompter.entidad.Guion;
import com.appmovil.teleprompter.repositorio.GuionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuionServicio {

    @Autowired
    private GuionRepositorio guionRepositorio;

    public Guion guardarGuion(Guion guion) {
        return guionRepositorio.save(guion);
    }

    public List<Guion> listarGuiones() {
        return guionRepositorio.findAll();
    }

    public Guion actualizarGuion(Long id, Guion guionActualizado) {

        Guion guion = guionRepositorio.findById(id)
                .orElseThrow();

        guion.setTitulo(guionActualizado.getTitulo());
        guion.setContenido(guionActualizado.getContenido());
        guion.setColorTexto(guionActualizado.getColorTexto());
        guion.setTamanoTexto(guionActualizado.getTamanoTexto());
        guion.setVelocidadScroll(guionActualizado.getVelocidadScroll());

        return guionRepositorio.save(guion);
    }

    public void eliminarGuion(Long id) {
        guionRepositorio.deleteById(id);
    }
}
