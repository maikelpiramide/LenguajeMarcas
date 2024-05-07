package com.example.instituto.Classes;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class TipodeGasto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    @OneToMany(mappedBy = "tipoDeGasto")
    private Set<Gasto> gastos;
    public TipodeGasto() {}

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Gasto> getGastos() {
        return gastos;
    }

    @Override
    public String toString() {
        return "TipodeGasto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
