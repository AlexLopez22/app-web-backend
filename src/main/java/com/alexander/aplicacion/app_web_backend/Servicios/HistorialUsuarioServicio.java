package com.alexander.aplicacion.app_web_backend.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexander.aplicacion.app_web_backend.Entitdades.HistorialUsuario;
import com.alexander.aplicacion.app_web_backend.Repositorios.HistorialUsuarioRepositorio;

@Service
public class HistorialUsuarioServicio {
    @Autowired
    private HistorialUsuarioRepositorio historialRepositorio;

    public HistorialUsuario guardarHistorial(HistorialUsuario historial) {
        return historialRepositorio.save(historial);
    }

    public List<HistorialUsuario> obtenerHistorialPorUsuario(Long usuarioId) {
        return historialRepositorio.findByUsuarioId(usuarioId);
    }
}

