package com.example.cpifppiramide.noticias.Classes;

public class Noticia {
    private String titulo;
    private String descripcion;
    private String autor;
    private String fechaPublicacion;

    public Noticia(String titulo, String descripcion, String autor, String fechaPublicacion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.autor =autor;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }
}
