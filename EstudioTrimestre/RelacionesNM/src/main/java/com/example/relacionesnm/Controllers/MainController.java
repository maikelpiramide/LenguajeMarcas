package com.example.relacionesnm.Controllers;

import com.example.relacionesnm.Classes.Corredor;
import com.example.relacionesnm.Classes.Modalidad;
import com.example.relacionesnm.Repository.CorredorRepository;
import com.example.relacionesnm.Repository.ModalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private ModalidadRepository modalidadRepository;
    @Autowired
    private CorredorRepository corredorRepository;
    @GetMapping("/")
    public String index() {
        List<Modalidad> modalidades = modalidadRepository.findAll();
        for (Modalidad modalidad : modalidades) {
            System.out.println(modalidad.toString());
        }
        System.out.println();
        System.out.println("parte de corredores");
        System.out.println();
        List<Corredor> corredores = corredorRepository.findAll();
        corredores.forEach(corredor -> {
            System.out.println(corredor.toString());

        });
        return "index";
    }
}
