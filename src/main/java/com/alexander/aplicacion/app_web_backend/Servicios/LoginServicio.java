package com.alexander.aplicacion.app_web_backend.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.alexander.aplicacion.app_web_backend.Entitdades.Usuario;
import com.alexander.aplicacion.app_web_backend.Repositorios.UsuarioRepositorio;
import com.alexander.aplicacion.app_web_backend.Seguridad.JwtUtil;

@Service
public class LoginServicio {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    public String login(String nombreUsuario, String contrasena) {
        Usuario usuario = usuarioRepositorio.findByNombreUsuario(nombreUsuario)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        if (passwordEncoder.matches(contrasena, usuario.getContrasena())) {
            return jwtUtil.generarToken(usuario.getNombreUsuario(), usuario.getRol());
        } else {
            throw new RuntimeException("Contraseña incorrecta");
        }
    }
}

