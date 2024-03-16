package com.example.cpifppiramide.noticias.Controller;

import com.example.cpifppiramide.noticias.Classes.Noticia;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model) {
        Noticia noticia = new Noticia("Los 25 móviles con los diseños más locos que se han visto","Aunque casi todos los móviles nos parezcan iguales, hay algunos que se salen de la norma...","Maikel","20 de octubre de 2023");
        model.addAttribute("noticia",noticia);
        return "index";
    }
    @GetMapping("/login")
    public String login() {

        return "login";
    }
    @GetMapping("/create_user")
    public String createUser() {

        return "createUser";

    }
}
