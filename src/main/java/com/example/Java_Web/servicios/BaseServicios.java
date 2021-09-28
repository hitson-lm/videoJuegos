package com.example.Java_Web.servicios;

import java.util.List;

public interface BaseServicios<E> {     // con esta anotacion <E> decimos que nuestra interfaz va ser de tipo genérica, quiere decir que va poder recibir algun tipo Entidad.

    // CREAMOS LOS METODOS QUE NECESITAMOS (CRUD)

    public List<E> findAll() throws Exception;     //Buscar o encontrar todos los registros.
    public E findById(long id) throws Exception;   //Encontrar por id.
    public E saveOne(E entity) throws Exception;   //Guardad o registrar un objeto Entidad.
    public E updateOne(E entity) throws Exception; //Actualizar un registro.
    public boolean deleteById(long id) throws Exception;   //Eliminar un _Registro.

}
