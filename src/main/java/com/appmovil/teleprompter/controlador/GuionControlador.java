package com.appmovil.teleprompter.controlador;

import com.appmovil.teleprompter.entidad.Guion;
import com.appmovil.teleprompter.servicio.GuionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guiones")

public class GuionControlador {

    @Autowired
    private GuionServicio guionServicio;

    @PostMapping
    public Guion guardarGuion(@RequestBody Guion guion) {
        return guionServicio.guardarGuion(guion);
    }

    @GetMapping
    public List<Guion> listarGuiones() {
        return guionServicio.listarGuiones();
    }

    @PutMapping("/{id}")
    public Guion actualizarGuion(
            @PathVariable Long id,
            @RequestBody Guion guion) {

        return guionServicio.actualizarGuion(id, guion);
    }

    @DeleteMapping("/{id}")
    public void eliminarGuion(@PathVariable Long id) {
        guionServicio.eliminarGuion(id);
    }
}