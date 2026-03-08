package com.alexander.aplicacion.app_web_backend.Entitdades;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "historial_usuario")
public class HistorialUsuario {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuario_id")
    private Long usuarioId;

    @Column(name = "pelicula_id")
    private Long peliculaId;

    @Column(name = "fecha_visto")
    private LocalDateTime fechaVisualizacion;


    
    public HistorialUsuario(Long id, Long usuarioId, Long peliculaId, LocalDateTime fechaVisualizacion) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.peliculaId = peliculaId;
        this.fechaVisualizacion = fechaVisualizacion;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
    public Long getPeliculaId() {
        return peliculaId;
    }
    public void setPeliculaId(Long peliculaId) {
        this.peliculaId = peliculaId;
    }
    public LocalDateTime getFechaVisualizacion() {
        return fechaVisualizacion;
    }
    public void setFechaVisualizacion(LocalDateTime fechaVisualizacion) {
        this.fechaVisualizacion = fechaVisualizacion;
    }



    
}
