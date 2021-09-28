package com.example.Java_Web.servicios;

import com.example.Java_Web.entidades.Categoria;
import com.example.Java_Web.repositorios.RepositorioCategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service    // con esta anotacion indicamos que esa clase es un servicio.
public class ServicioCategoria implements BaseServicios<Categoria>{     //implementamos el interfaz BaseServicios<Categoria> de la entidad Categoria.

    // Declaramos una variable Objeto de tipo "RepositorioCategoria".

    @Autowired  // anotacion para la inyeccion de dependencias que requiere el ServicioCategoria.
    private RepositorioCategoria repositorioCategoria;

    // constructor para obtener las dependencias que necesita el Servicio.
    /*
    public ServicioCategoria(RepositorioCategoria repositorioCategoria){
        this.repositorioCategoria=repositorioCategoria;

    }
    */

    //implementamos _todo sus métodos de la Interfaz "BaseServicios", para el uso de la entidad "Categoria"

    @Override       //esta anotacion se hace para sobre escribir el metodo, cuando se hace una implementacion de una interface.
    @Transactional  // hace transacciones con la base datos, por cada método que este asignado esta anotacion.
    public List<Categoria> findAll() throws Exception {
        try {
            List<Categoria> listCategoria= this.repositorioCategoria.findAll();
            return listCategoria;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional  // hace transacciones con la base datos,
    public Categoria findById(long id) throws Exception {
        try {
            //Optional<Entity> una clase que puede o no contener un valor, es decir, que se comporta como un wrapper para cualquier tipo de objeto que pueda o no ser nulo
            Optional<Categoria> optEntity=this.repositorioCategoria.findById(id); // para buscar si la bd hay un entidad o un registro que tenga esa id.
            return optEntity.get();     // obtiene un entidad

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional  // hace transacciones con la base datos,
    public Categoria saveOne(Categoria entity) throws Exception {
        try {
            Categoria categoria=this.repositorioCategoria.save(entity);
            return categoria;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional  // hace transacciones con la base datos,
    public Categoria updateOne(Categoria entity,long id) throws Exception {
        try {
            Optional<Categoria> optCat=this.repositorioCategoria.findById(id);
            Categoria categoria=optCat.get();
            categoria = this.repositorioCategoria.save(entity);
            return categoria;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional  // hace transacciones con la base datos,
    public boolean deleteById(long id) throws Exception {
        try {
            Optional<Categoria> opt = this.repositorioCategoria.findById(id);
            if (!opt.isPresent()) {
                Categoria categoria = opt.get();
                categoria.setActivo(!categoria.isActivo());
                this.repositorioCategoria.save(categoria);
            } else {
                throw new Exception();
            }
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
