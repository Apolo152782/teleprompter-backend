package com.appmovil.teleprompter.entidad;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "guiones")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Guion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String contenido;

    private String colorTexto = "#FFFFFF";

    private Integer tamanoTexto = 24;

    private Integer velocidadScroll = 3;
}