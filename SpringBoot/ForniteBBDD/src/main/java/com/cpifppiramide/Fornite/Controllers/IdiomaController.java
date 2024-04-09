package com.cpifppiramide.Fornite.Controllers;

import com.cpifppiramide.Fornite.Classes.Idioma;
import com.cpifppiramide.Fornite.Reposiroty.IdiomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
@Controller
public class IdiomaController {
    @Autowired
    IdiomaRepository idiomaRepository;
    @GetMapping("/create_idioma")
    public String idiomas(Model model){
        model.addAttribute("idioma",new Idioma());
        return "idioma";
    }
    @PostMapping("/create_idioma")
    public String newIdioma(@ModelAttribute Idioma idioma, Model model){
        //idiomaRepository.save(new Idioma(idioma.getCodigo(),idioma.getNombre()));
        idiomaRepository.save(idioma);
        model.addAttribute("idioma",idioma);

        //idiomaRepository.save(idioma);

        return "idioma";
    }
}
