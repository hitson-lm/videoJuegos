package com.example.Java_Web.repositorios;

import com.example.Java_Web.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // 1ero asigamos la anotacion @Repository a clase interface.
// JpaRepository interfaz proporciona una funcionalidad CRUD sofisticada para la clase de entidad que se está administrando.
public interface RepositorioCategoria extends JpaRepository<Categoria,Long> {  // 2do heredamos JpaRepository con sus
                    // parametros<clase entidad, clase Long(porque id es, de tipo long)> para utilizar sus funciones.

}
