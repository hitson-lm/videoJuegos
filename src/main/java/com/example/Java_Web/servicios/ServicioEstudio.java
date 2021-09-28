package com.example.Java_Web.servicios;

import com.example.Java_Web.entidades.Estudio;

import java.util.List;

public class ServicioEstudio implements BaseServicios<Estudio>{     //implementamos el interfaz BaseServicios<Estudio> del la entidad Estudio.

    //implementamos _todo sus métodos de la Interfaz "BaseServicios", para el uso de la entidad "Estudio"
    @Override
    public List<Estudio> findAll() throws Exception {
        return null;
    }

    @Override
    public Estudio findById(long id) throws Exception {
        return null;
    }

    @Override
    public Estudio saveOne(Estudio entity) throws Exception {
        return null;
    }

    @Override
    public Estudio updateOne(Estudio entity, long id) throws Exception {
        return null;
    }

    @Override
    public boolean deleteById(long id) throws Exception {
        return false;
    }
}
