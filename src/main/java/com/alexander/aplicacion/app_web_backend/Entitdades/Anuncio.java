package com.alexander.aplicacion.app_web_backend.Entitdades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "anuncio")
public class Anuncio {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo; // banner, interstitial, rewarded
    private String posicion; // catalogo, reproductor, etc.
    private boolean activo;
    
    public Anuncio(){
        
    }

    public Anuncio(Long id, String tipo, String posicion, boolean activo) {
        this.id = id;
        this.tipo = tipo;
        this.posicion = posicion;
        this.activo = activo;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }


    
}
