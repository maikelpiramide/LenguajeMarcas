package com.cpifppiramide.Fornite.Controllers;

import com.cpifppiramide.Fornite.Classes.Juego;

import com.cpifppiramide.Fornite.Reposiroty.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JuegoController {
    @Autowired
    JuegoRepository juegoRepository;

    @GetMapping("/crearJuego")
    public String crearJuego(Model model){

        model.addAttribute("juego",new Juego());
        return "crearJuego";
    }
    @PostMapping("/crearJuego/newJuego")
    public String crearJuego_newJuego(@ModelAttribute Juego juegoNuevo, Model model){
        List<Juego> juegos = juegoRepository.findAll();
        boolean existe = false;
        for(Juego juego:juegos) {

            if(juego.getNombre().equals(juegoNuevo.getNombre())){
                model.addAttribute("juegoExistente",true);
                existe = true;
                return "crearJuego";
            }
        }
        if(!existe){
            juegoRepository.save(juegoNuevo);
            model.addAttribute("guardado",true);
            return "crearJuego";
        }
        //juegoRepository.save(juegoNuevo);
        System.out.println(juegoNuevo.toString());
        return "crearJuego";
    }
    @GetMapping("/ver_juegos")
    public String verJuegos(Model model){
        List<Juego> juegos = juegoRepository.findAll();
        /*for(Juego j: juegos){
            System.out.println(j.toString());
        }*/
        model.addAttribute("juegos",juegos);
        return "verJuegos";
    }
}
