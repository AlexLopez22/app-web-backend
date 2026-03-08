package com.alexander.aplicacion.app_web_backend.Dtos;

public class UsuarioDTO {
    
    private String nombreUsuario;
    private String rol;
    private String estadoSuscripcion;

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public String getEstadoSuscripcion() {
        return estadoSuscripcion;
    }
    public void setEstadoSuscripcion(String estadoSuscripcion) {
        this.estadoSuscripcion = estadoSuscripcion;
    }    
}
