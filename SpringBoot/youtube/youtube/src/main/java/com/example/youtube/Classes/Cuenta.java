package com.example.youtube.Classes;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="nombre")
    private String nombre;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_editor_id", referencedColumnName="id")
    private Editor editor;

    @OneToMany(mappedBy = "cuenta")
    private List<Video> videos;

    public Cuenta(){}

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Editor getEditor() {
        return editor;
    }

    public List<Video> getVideos() {
        return videos;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", editor=          " + "            \n" + editor + "\n" +
                ",                videos=                   " + videos +
                '}' + "\n \n \n";
    }
}
