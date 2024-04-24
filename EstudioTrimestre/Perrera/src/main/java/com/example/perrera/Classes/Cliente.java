package com.example.perrera.Classes;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    private String primerApellido;

    private String segundoApellido;

    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_perro",referencedColumnName = "id")
    private Perro perro;

}
