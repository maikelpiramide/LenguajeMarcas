package com.example.instituto.Controllers;

import com.example.instituto.Classes.GenerarBackup;

import com.example.instituto.Repository.GastoRepository;
import com.example.instituto.Repository.ProfesorRepository;
import com.example.instituto.Repository.TipodeGastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private GastoRepository gastoRepository;
    @Autowired
    private ProfesorRepository profesorRepository;
    @Autowired
    private TipodeGastoRepository tipodeGastoRepository;
    @GetMapping("/")
    public String index() {

        gastoRepository.findAll().forEach(gasto -> System.out.println(gasto));

        GenerarBackup.crearFichero(profesorRepository.findAll(),tipodeGastoRepository.findAll(),gastoRepository.findAll());

        return "index";
    }
}
