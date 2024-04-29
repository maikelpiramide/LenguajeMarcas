package com.example.relacionesnm.Classes;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Corredor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    private String email;

    private int dorsal;

    @ManyToMany(mappedBy = "corredores")
    Set<Modalidad> modalidades;

    public Corredor() {}

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getDorsal() {
        return dorsal;
    }

    public Set<Modalidad> getModalidades() {
        return modalidades;
    }

    @Override
    public String toString() {
        return "Corredor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", dorsal=" + dorsal + "\n" +

                '}';
    }
}
