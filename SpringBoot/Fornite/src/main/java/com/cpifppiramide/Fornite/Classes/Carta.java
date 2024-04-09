package com.cpifppiramide.Fornite.Classes;

public class Carta {
    private String imagen;
    private double numeroJugadores;
    private String titulo;
    public Carta(String imagen,String titulo,double numeroJugadores){
        this.imagen = imagen;
        this.titulo = titulo;
        this.numeroJugadores = numeroJugadores;
    }


    public String getImagen() {
        return imagen;
    }

    public double getNumeroJugadores() {
        return numeroJugadores;
    }

    public String getTitulo() {
        return titulo;
    }
}
