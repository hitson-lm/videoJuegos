package com.example.Java_Web.entidades;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //genera un valor auto incremental
    private long id;
    private String nombre;
    private boolean activo = true;

    // Anotaciones para hacer las relaciones de las tablas
    @OneToMany(mappedBy = "categoria")    //relaccion de tablas [categorias-videojuegos]  Mapeado por "categoria"
    // definimos una variable lista de tipo objeto "Videojuego"
    private List<Videojuego> videojuegos;

}


