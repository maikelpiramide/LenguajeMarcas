
package com.cpifppiramide.Fornite.Controllers;

import com.cpifppiramide.Fornite.Classes.Carta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model){
        ArrayList<Carta> cartas = new ArrayList<>();
        Carta carta1 = new Carta("lego.jpg","LEGO Fortnite",87.7);
        Carta carta2 = new Carta("rocket.jpg","Rocket Racing",10.7);
        Carta carta3 = new Carta("festival.jpg","Escenario Princial de Festival",18.5);
        Carta carta4 = new Carta("impro.jpg","Escenario de Improvisacion",1.6);

        cartas.add(carta1);
        cartas.add(carta2);
        cartas.add(carta3);
        cartas.add(carta4);

        model.addAttribute("cartas",cartas);
        return ("index");
    }

}

