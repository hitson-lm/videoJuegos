package com.example.Java_Web.repositorios;

import com.example.Java_Web.entidades.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RepositorioVideojuego extends JpaRepository<Videojuego,Long> {
    // implementados dos metodos
    // metodo 1: findAllByActivo() buscar o entontrar por su estado(activo-no activo).
    @Query(value = "SELECT * FROM videojuegos WHERE videojuegos.activo=true",nativeQuery = true)
    List<Videojuego> findAllByActivo(); // la funcion te retorna todos los valores de la base de datos, siempre en cuando cumpla las condiciones de la query.

    // metodo 2: buscar por su Identificador  y el estado (activo-no activo)
    @Query(value = "SELECT * FROM videojuegos WHERE videojuegos.id = :id AND videojuegos.activo=true", nativeQuery = true)
    Optional<Videojuego> buscarPorIdyActivo(@Param("id") long id);
}
