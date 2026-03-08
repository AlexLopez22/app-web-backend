package com.alexander.aplicacion.app_web_backend.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.alexander.aplicacion.app_web_backend.Entitdades.Pelicula;
import com.alexander.aplicacion.app_web_backend.Servicios.PeliculaServicio;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaControlador {

    @Autowired
    private PeliculaServicio peliculaServicio;

    @GetMapping
    public ResponseEntity<List<Pelicula>> listarTodas() {
        return ResponseEntity.ok(peliculaServicio.listarTodas());
    }

    @GetMapping("/categoria/{categoria}")
    public ResponseEntity<List<Pelicula>> listarPorCategoria(@PathVariable String categoria) {
        return ResponseEntity.ok(peliculaServicio.listarPorCategoria(categoria));
    }
}
