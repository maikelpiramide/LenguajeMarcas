package com.cpifppiramide.Fornite.Classes;

public class Idioma {
    private String codigo;
    private String nombre;
   /* Idioma(String codigo,String nombre){
        this.codigo = codigo;
        this.nombre=nombre;
    }*/

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}
