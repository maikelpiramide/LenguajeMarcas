package com.example.youtube.Classes;

import jakarta.persistence.*;

@Entity
public class Editor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="email")
    private String email;

    @Column(name="edad")
    private int edad;

    @OneToOne(mappedBy = "editor")
    private Cuenta cuenta;


    public Editor(){}


    ///getters
    public long getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +

                '}';
    }
}
