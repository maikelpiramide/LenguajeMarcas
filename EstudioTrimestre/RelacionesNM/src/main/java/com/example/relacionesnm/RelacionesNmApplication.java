package com.example.relacionesnm;

import com.example.relacionesnm.Classes.Modalidad;
import com.example.relacionesnm.Repository.ModalidadRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class RelacionesNmApplication implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("ver modalidades con sus corredores");

    }

    public static void main(String[] args) {
        SpringApplication.run(RelacionesNmApplication.class, args);

    }

}
