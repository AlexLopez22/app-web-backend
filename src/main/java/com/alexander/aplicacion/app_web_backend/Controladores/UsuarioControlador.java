package com.alexander.aplicacion.app_web_backend.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexander.aplicacion.app_web_backend.Entitdades.Usuario;
import com.alexander.aplicacion.app_web_backend.Servicios.UsuarioServicio;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @PostMapping("/registrar")
    public ResponseEntity<Usuario> registrar(@RequestBody Usuario usuario) {
        Usuario nuevo = usuarioServicio.registrar(usuario);
        return ResponseEntity.ok(nuevo);
    }

    @GetMapping("/{nombreUsuario}")
    public ResponseEntity<Usuario> obtenerPorNombre(@PathVariable String nombreUsuario) {
        return usuarioServicio.buscarPorNombre(nombreUsuario)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
