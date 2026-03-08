package com.alexander.aplicacion.app_web_backend.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexander.aplicacion.app_web_backend.Servicios.LoginServicio;
import java.util.Map;
import java.util.Collections;

@RestController
@RequestMapping("/api/auth")
public class LoginControlador {

    @Autowired
    private LoginServicio loginServicio;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> credenciales) {
        String nombreUsuario = credenciales.get("nombreUsuario");
        String contrasena = credenciales.get("contrasena");

        String token = loginServicio.login(nombreUsuario, contrasena);

        return ResponseEntity.ok(Collections.singletonMap("token", token));
    }
}
