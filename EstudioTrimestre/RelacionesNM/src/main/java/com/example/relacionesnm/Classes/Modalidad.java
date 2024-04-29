package com.example.relacionesnm.Classes;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Modalidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    private String ciudad;

    private int km;

    @ManyToMany
    @JoinTable(name = "corredor_modalidad",
            joinColumns  = @JoinColumn(name="id_modalidad"),
            inverseJoinColumns = @JoinColumn(name="id_corredor")
    )
    private Set<Corredor> corredores;

    public Modalidad(){}

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getKm() {
        return km;
    }

    public Set<Corredor> getCorredores() {
        return corredores;
    }

    @Override
    public String toString() {
        return "Modalidad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", km=" + km +
                ", corredores=" + corredores +
                '}';
    }
}
