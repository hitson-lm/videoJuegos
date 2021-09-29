package com.example.Java_Web.servicios;
import com.example.Java_Web.entidades.Videojuego;
import com.example.Java_Web.repositorios.RepositorioVideojuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ServicioVideojuego implements BaseServicios<Videojuego>{   //implementamos el interfaz BaseServicios<Videojuego> del la entidad Videojuego.

    @Autowired
    public RepositorioVideojuego repositorioVideojuego;

    //implementamos _todo sus métodos de la Interfaz "BaseServicios". para el uso de la entidad "Videojuego"
    @Override
    @Transactional
    public List<Videojuego> findAll() throws Exception {
        try {
            List<Videojuego> listVideojuego=this.repositorioVideojuego.findAll();
            return listVideojuego;

        } catch (Exception e){
            throw new Exception(e.getMessage());

        }
    }

    @Override
    @Transactional
    public Videojuego findById(long id) throws Exception {
        try {
            Optional<Videojuego> opt = this.repositorioVideojuego.findById(id);
            return opt.get();

        } catch (Exception e){
            throw new Exception(e.getMessage());

        }
    }

    @Override
    @Transactional
    public Videojuego saveOne(Videojuego entity) throws Exception {
        try {
            Videojuego videojuego=this.repositorioVideojuego.save(entity);
            return videojuego;

        } catch (Exception e){
            throw new Exception(e.getMessage());

        }
    }

    @Override
    @Transactional
    public Videojuego updateOne(Videojuego entity,long id) throws Exception {
        try {
            Optional<Videojuego> opt =this.repositorioVideojuego.findById(id);
            Videojuego videojuego = opt.get();
            videojuego = this.repositorioVideojuego.save(entity);
            return videojuego;

        } catch (Exception e){
            throw new Exception(e.getMessage());

        }
    }

    @Override
    @Transactional
    public boolean deleteById(long id) throws Exception {
        try {
            Optional<Videojuego> opt =this.repositorioVideojuego.findById(id);
            if(!opt.isPresent()){
                Videojuego videojuego= opt.get();
                videojuego.setActivo(!videojuego.isActivo());
                this.repositorioVideojuego.save(videojuego);

            }else {
                throw new Exception();
            }
            return true;

        } catch (Exception e){
            throw new Exception(e.getMessage());

        }
    }

    // *************METODOS NUEVOS***********************
    @Transactional
    public List<Videojuego> findAllByActivo() throws Exception{
        try {
            List<Videojuego> listVideojuego=this.repositorioVideojuego.findAllByActivo();
            return listVideojuego;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public Videojuego findAByIdAndActivo(long id) throws Exception{
        try {
            Optional<Videojuego> opt =this.repositorioVideojuego.buscarPorIdyActivo(id);
            return opt.get();

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Videojuego> findByTitle(String q) throws Exception{
        try {
            List<Videojuego> listVideojuego=this.repositorioVideojuego.buscarPorTitulo(q);
            return listVideojuego;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
