package com.example.cpifppiramide.noticias.Classes;

public class Noticia {
    private String titulo;
    private String descripcion;
    private String autor;
    private String fechaPublicacion;
    private String imagen;

    public Noticia(String titulo, String descripcion, String autor, String fechaPublicacion,String rutaImagen){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.autor =autor;
        this.fechaPublicacion = fechaPublicacion;
        this.imagen = rutaImagen;
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

    public String getImagen() {
        return imagen;
    }
}
