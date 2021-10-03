package com.example.Java_Web.controladores;

import com.example.Java_Web.entidades.Categoria;
import com.example.Java_Web.servicios.ServicioCategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ControlodarCategoria {

    @Autowired
    private ServicioCategoria serviCategoria;

    @GetMapping("/")
    public String vistaCategoria(Model model){
        try {
            List<Categoria> listCategoria=serviCategoria.findAll();
            model.addAttribute("listCategoria",listCategoria);
            return "index";

        } catch (Exception e){
            return "error";

        }
    }
}
