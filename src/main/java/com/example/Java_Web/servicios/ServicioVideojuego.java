package com.example.Java_Web.servicios;

import com.example.Java_Web.entidades.Videojuego;

import java.util.List;

public class ServicioVideojuego implements BaseServicios<Videojuego>{   //implementamos el interfaz BaseServicios<Videojuego> del la entidad Videojuego.

    //implementamos _todo sus métodos de la Interfaz "BaseServicios". para el uso de la entidad "Videojuego"
    @Override
    public List<Videojuego> findAll() throws Exception {
        return null;
    }

    @Override
    public Videojuego findById(long id) throws Exception {
        return null;
    }

    @Override
    public Videojuego saveOne(Videojuego entity) throws Exception {
        return null;
    }

    @Override
    public Videojuego updateOne(Videojuego entity,long id) throws Exception {
        return null;
    }

    @Override
    public boolean deleteById(long id) throws Exception {
        return false;
    }
}
