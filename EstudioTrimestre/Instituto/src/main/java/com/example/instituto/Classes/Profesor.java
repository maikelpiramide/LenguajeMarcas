package com.example.instituto.Classes;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    public Profesor(){}

    public String getNombre() {
        return nombre;
    }
    @OneToMany(mappedBy = "profesor")
    private Set<Gasto> gastos;

    public long getId() {
        return id;
    }

    public Set<Gasto> getGastos() {
        return gastos;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
