package com.example.Java_Web.servicios;

import com.example.Java_Web.entidades.Categoria;

import java.util.List;

public class ServicioCategoria implements BaseServicios<Categoria>{     //implementamos el interfaz BaseServicios<Categoria> de la entidad Categoria.

    //implementamos _todo sus métodos de la Interfaz "BaseServicios", para el uso de la entidad "Categoria"
    @Override
    public List<Categoria> findAll() throws Exception {
        return null;
    }

    @Override
    public Categoria findById(long id) throws Exception {
        return null;
    }

    @Override
    public Categoria saveOne(Categoria entity) throws Exception {
        return null;
    }

    @Override
    public Categoria updateOne(Categoria entity) throws Exception {
        return null;
    }

    @Override
    public boolean deleteById(long id) throws Exception {
        return false;
    }

}
