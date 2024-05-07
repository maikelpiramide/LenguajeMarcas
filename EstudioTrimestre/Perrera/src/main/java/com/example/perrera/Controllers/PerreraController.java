package com.example.perrera.Controllers;

import com.example.perrera.Classes.Cliente;
import com.example.perrera.Classes.GenerarFichero;
import com.example.perrera.Classes.Perro;
import com.example.perrera.Repository.ClienteRepository;
import com.example.perrera.Repository.PerroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PerreraController {
    @Autowired
    private PerroRepository perroRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/")
    public String index(){
        List<Perro> perros = perroRepository.findAll();
        List<Cliente> clientes = clienteRepository.findAll();



        GenerarFichero.crearBackup((ArrayList<Cliente>) clientes);

        System.out.println();
        System.out.println("zona clientes");

        perros.stream().forEach(perro -> System.out.println(perro));
        clientes.stream().forEach(cliente -> System.out.println(cliente));
        return "index";
    }
}
