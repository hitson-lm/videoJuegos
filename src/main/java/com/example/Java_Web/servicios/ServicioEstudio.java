package com.example.Java_Web.servicios;

import com.example.Java_Web.entidades.Estudio;
import com.example.Java_Web.repositorios.RepositorioEstudio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ServicioEstudio implements BaseServicios<Estudio>{     //implementamos el interfaz BaseServicios<Estudio> del la entidad Estudio.

    @Autowired
    public RepositorioEstudio repositorioEstudio;

    //implementamos _todo sus métodos de la Interfaz "BaseServicios", para el uso de la entidad "Estudio"
    @Override
    @Transactional
    public List<Estudio> findAll() throws Exception {
        try {
            List<Estudio> listEstudio=this.repositorioEstudio.findAll();
            return listEstudio;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Estudio findById(long id) throws Exception {
        try {
            Optional<Estudio> opt=this.repositorioEstudio.findById(id);
            return opt.get();

        } catch (Exception e){
            throw new Exception(e.getMessage());

        }
    }

    @Override
    @Transactional
    public Estudio saveOne(Estudio entity) throws Exception {
        try {
            Estudio estudio=this.repositorioEstudio.save(entity);
            return estudio;

        } catch (Exception e){
            throw new Exception(e.getMessage());

        }
    }

    @Override
    @Transactional
    public Estudio updateOne(Estudio entity, long id) throws Exception {
        try {
            Optional<Estudio> opt = this.repositorioEstudio.findById(id);
            Estudio estudio = opt.get();
            estudio=this.repositorioEstudio.save(entity);
            return estudio;

        } catch (Exception e){
            throw new Exception(e.getMessage());

        }
    }

    @Override
    @Transactional
    public boolean deleteById(long id) throws Exception {
        try {
            Optional<Estudio> opt =this.repositorioEstudio.findById(id);

            if(!opt.isPresent()){
                Estudio estudio=opt.get();
                estudio.setActivo(!estudio.isActivo());
                this.repositorioEstudio.save(estudio);
            }else {
                throw new Exception();
            }

            return true;

        } catch (Exception e){
            throw new Exception(e.getMessage());

        }
    }
}
