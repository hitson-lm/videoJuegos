package com.example.Java_Web.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "estudios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Estudio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //genera un valor auto incremental
    private long id;
    private String nombre;
    private boolean activo=true;


    @OneToMany(mappedBy = "estudio")    //relaccion de tablas [estudios-videojuegos] Mapeado por "estudio"
    // definimos una variable lista de tipo objeto "Videojuego"
    private List<Videojuego> videojuegos;

}
