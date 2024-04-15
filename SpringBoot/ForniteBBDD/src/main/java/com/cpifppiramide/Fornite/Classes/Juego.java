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
    private String fecha_creacion;
    private int activado;
    private String email_creador;
    private int visualizar_paises;
    private String comentario;
    public Juego(){}
    public Juego(String nombre,String fecha,int activado, String emailCreador, int visualizarPaises,String comentario){
        this.nombre = nombre;
        this.fecha_creacion = fecha;
        this.activado = activado;
        this.email_creador = emailCreador;
        this.visualizar_paises = visualizarPaises;
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
        String salida = this.fecha_creacion;
        try{
            Date fecha = inputFormat.parse(this.fecha_creacion);
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
        return email_creador;
    }

    public int getVisualizarPaises() {
        return visualizar_paises;
    }

    public String getComentario() {
        return comentario;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha='" + fecha_creacion + '\'' +
                ", activado=" + activado +
                ", emailCreador='" + email_creador + '\'' +
                ", visualizarPaises=" + visualizar_paises +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
