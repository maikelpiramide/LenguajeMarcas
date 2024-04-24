package com.example.youtube.Classes;

import jakarta.persistence.*;

@Entity
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="duracion")
    private int duracion;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="numero_de_likes")
    private int numeroDeLikes;

    @ManyToOne
    @JoinColumn(name="fk_cuenta_id",nullable = false)
    private Cuenta cuenta;

    public Video() {}

    public Cuenta getCuenta() {
        return cuenta;
    }

    public int getNumeroDeLikes() {
        return numeroDeLikes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public long getId() {
        return id;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", descripcion='" + descripcion + '\'' +
                ", numeroDeLikes=" + numeroDeLikes +

                '}';
    }
}
