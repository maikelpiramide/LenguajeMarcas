package com.example.youtube.Controller;

import com.example.youtube.Classes.Cuenta;
import com.example.youtube.Classes.GenerarFichero;
import com.example.youtube.Repository.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class YoutubeController {
    @Autowired
    private CuentaRepository cuentaRepository;

    @GetMapping("/")
    public String index() {
        List<Cuenta> cuentas = cuentaRepository.findAll();

        cuentas.stream().forEach(cuenta -> System.out.println(cuenta));

        GenerarFichero.crearFichero((ArrayList<Cuenta>)cuentas);
        return "index";
    }
}
