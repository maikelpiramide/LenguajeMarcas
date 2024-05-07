package com.example.perrera.Classes;

import jakarta.persistence.*;

@Entity
public class Perro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="numero_chip")
    private String numeroChip;

    private int edad;

    @ManyToOne
    @JoinColumn(name = "id_cuidador", nullable = false)
    private Cuidador cuidador;

    @OneToOne(mappedBy = "perro")
    private Cliente cliente;

    public Perro(){}

    public Cuidador getCuidador() {
        return cuidador;
    }

    public int getEdad() {
        return edad;
    }

    public String getNumeroChip() {
        return numeroChip;
    }

    public String getNombre() {
        return nombre;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", numeroChip='" + numeroChip + '\'' +
                ", edad=" + edad +
                ", cuidador=" + cuidador +
                '}';
    }
}
