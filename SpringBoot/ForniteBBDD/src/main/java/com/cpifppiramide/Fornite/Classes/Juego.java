package com.cpifppiramide.Fornite.Classes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Juego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String fechaCreacion;
    private int activado;
    private String emailCreador;
    private boolean visualizarPaises;
    private String comentario;
    public Juego(){}
    public Juego(String nombre,String fecha,int activado, String emailCreador, boolean visualizarPaises,String comentario){
        this.nombre = nombre;
        this.fechaCreacion = fecha;
        this.activado = activado;
        this.emailCreador = emailCreador;
        this.visualizarPaises = visualizarPaises;
        this.comentario  = comentario;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaCreacion() {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
        String salida = this.fechaCreacion;
        try{
            Date fecha = inputFormat.parse(this.fechaCreacion);
            salida = outputFormat.format(fecha);
        }catch(Exception ex){
            System.out.println(ex);
        }

        return salida;
    }

    public int getActivado() {
        return activado;
    }

    public String getEmailCreador() {
        return emailCreador;
    }

    public boolean getVisualizarPaises() {
        return visualizarPaises;
    }

    public String getComentario() {
        return comentario;
    }

    //seters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setActivado(int activado) {
        this.activado = activado;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setEmailCreador(String emailCreador) {
        this.emailCreador = emailCreador;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setVisualizarPaises(boolean visualizarPaises) {
        this.visualizarPaises = visualizarPaises;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha='" + fechaCreacion + '\'' +
                ", activado=" + activado +
                ", emailCreador='" + emailCreador + '\'' +
                ", visualizarPaises=" + visualizarPaises +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
