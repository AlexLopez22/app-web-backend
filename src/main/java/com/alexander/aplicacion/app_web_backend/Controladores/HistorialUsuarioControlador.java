package com.alexander.aplicacion.app_web_backend.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexander.aplicacion.app_web_backend.Entitdades.HistorialUsuario;
import com.alexander.aplicacion.app_web_backend.Servicios.HistorialUsuarioServicio;
import java.util.List;

@RestController
@RequestMapping("/api/historial")
public class HistorialUsuarioControlador {

    @Autowired
    private HistorialUsuarioServicio historialServicio;

    @PostMapping("/guardar")
    public ResponseEntity<HistorialUsuario> guardar(@RequestBody HistorialUsuario historial) {
        return ResponseEntity.ok(historialServicio.guardarHistorial(historial));
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<HistorialUsuario>> obtenerPorUsuario(@PathVariable Long usuarioId) {
        return ResponseEntity.ok(historialServicio.obtenerHistorialPorUsuario(usuarioId));
    }
}

