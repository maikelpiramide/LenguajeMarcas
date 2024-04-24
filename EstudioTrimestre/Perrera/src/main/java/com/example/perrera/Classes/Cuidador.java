package com.example.perrera.Classes;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cuidador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="nombre")
    private String nombre;

    @OneToMany( mappedBy = "cuidador")
    private List<Perro> perros;

    public Cuidador(){}

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Cuidador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
