package com.alexander.aplicacion.app_web_backend.Respuestas;

public class ApiResponse<T> {
    private String mensaje;
    private T data;
    private String error;

    public ApiResponse(String mensaje, T data, String error) {
        this.mensaje = mensaje;
        this.data = data;
        this.error = error;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    
}