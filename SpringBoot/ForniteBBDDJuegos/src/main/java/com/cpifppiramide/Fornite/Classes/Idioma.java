package com.cpifppiramide.Fornite.Classes;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Idioma {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String nombre;
    public Idioma(){}
   public Idioma(String codigo,String nombre){
        this.codigo = codigo;
        this.nombre=nombre;
    }

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

    public Long getId() {
        return id;
    }
}
