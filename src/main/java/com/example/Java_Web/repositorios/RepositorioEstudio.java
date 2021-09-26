package com.example.Java_Web.repositorios;

import com.example.Java_Web.entidades.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEstudio extends JpaRepository<Estudio,Long> {

}
