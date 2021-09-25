package com.example.Java_Web.entidades;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity     // la class Videojuego se va mapear en la BD como una tabla
@Table(name = "videojuegos")    //sobre escribe el nombre de la tabla.
@Getter     //genera los metodos Getters
@Setter     //genera los metodos Setters
@AllArgsConstructor //te construye el constructor, con todos los parametros.
@NoArgsConstructor  // te construye el contructor vacio,sin parametros.

public class Videojuego {

    @Id //asignamos el identificador de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) //te genera un valor auto incremental
    private long id;
    private String titulo;
    private String descripcion;
    private String imagen;
    private float precio;
    private boolean stock;
    private Date fechaLanzamiento;
    private boolean activo=true;

    //Relacion de tablas: [videojuegos-estudios], [videojuegos-categorias]
    @ManyToOne(fetch = FetchType.EAGER)     //la tabla "videojuegos" tiene una relacion de Muchos a Uno con la tabla "estudios", Tipo EAGER
    @JoinColumn(name = "fk_estudio",nullable = false)   //la tabla: "ideojuegos" recibe la llave foranea "fk_estudio" de la tabla "estudios"
    // definimos una variable privada de tipo objeto Estudio.
    private Estudio estudio;

    @ManyToOne(fetch = FetchType.EAGER)     //la tabla "videojuegos" tiene una relacion de Muchos a Uno con la tabla "categorias", es de Tipo EAGER
    @JoinColumn(name = "fk_categoria",nullable = false) //la tabla: "videojuegos" recibe la llave foranea "fk_estudio" de la tabla "categorias"
    // definimos una variable privada de tipo objeto Categoria.
    private Categoria categoria;

}
