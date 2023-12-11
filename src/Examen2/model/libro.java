package Examen2.model;

import Examen2.util.DatabaseConnection;

import java.sql.Connection;

public class libro {
    private int id;
    private String titulo;
    private String autor;

    public libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public libro() {
    }


    @Override
    public String toString() {
        return "libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
