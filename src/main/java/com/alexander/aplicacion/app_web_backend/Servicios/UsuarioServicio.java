package com.alexander.aplicacion.app_web_backend.Servicios;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alexander.aplicacion.app_web_backend.Entitdades.Usuario;
import com.alexander.aplicacion.app_web_backend.Repositorios.UsuarioRepositorio;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class UsuarioServicio {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private PasswordEncoder passwordEncoder;
  

    public Usuario registrar(Usuario usuario) {
        usuario.setContrasena(passwordEncoder.encode(usuario.getContrasena()));
        return usuarioRepositorio.save(usuario);
    }

    public Optional<Usuario> buscarPorNombre(String nombreUsuario) {
        return usuarioRepositorio.findByNombreUsuario(nombreUsuario);
    }
}
