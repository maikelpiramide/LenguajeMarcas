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

    public Cliente(){}

    public Perro getPerro() {
        return perro;
    }

    public String getEmail() {
        return email;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getNombre() {
        return nombre;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", email='" + email + '\'' +
                ", perro=" + perro +
                '}';
    }
}
