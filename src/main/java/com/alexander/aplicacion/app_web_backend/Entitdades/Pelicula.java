package com.alexander.aplicacion.app_web_backend.Entitdades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula")
public class Pelicula {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descripcion;
    
    @Column(name = "url_stream")
    private String urlStream; // enlace al servidor/CDN
    
    private String categoria;

    public Pelicula(){

    }
    
    public Pelicula(Long id, String titulo, String descripcion, String urlStream, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.urlStream = urlStream;
        this.categoria = categoria;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getUrlStream() {
        return urlStream;
    }
    public void setUrlStream(String urlStream) {
        this.urlStream = urlStream;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
}
