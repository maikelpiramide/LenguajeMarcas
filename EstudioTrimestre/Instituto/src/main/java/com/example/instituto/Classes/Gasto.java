package com.example.instituto.Classes;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Gasto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double precio;

    @ManyToOne
    @JoinColumn(name = "fk_tipo_de_gasto_id", nullable = false)
    private TipodeGasto tipoDeGasto;

    @ManyToOne
    @JoinColumn(name="fk_profesor_id",nullable = false)
    private Profesor profesor;

    public Gasto(){}

    public long getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public TipodeGasto getTipodeGasto() {
        return tipoDeGasto;
    }

    @Override
    public String toString() {
        return "Gasto{" +
                "id=" + id +
                ", precio=" + precio +
                ", tipodeGasto=" + tipoDeGasto +
                ", profesor=" + profesor +
                '}';
    }
}
