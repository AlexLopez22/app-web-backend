package com.alexander.aplicacion.app_web_backend.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexander.aplicacion.app_web_backend.Entitdades.Pelicula;
import com.alexander.aplicacion.app_web_backend.Repositorios.PeliculaRepositorio;

@Service
public class PeliculaServicio {
    @Autowired
    private PeliculaRepositorio peliculaRepositorio;

    public List<Pelicula> listarTodas() {
        return peliculaRepositorio.findAll();
    }

    public List<Pelicula> listarPorCategoria(String categoria) {
        return peliculaRepositorio.findByCategoria(categoria);
    }
}
