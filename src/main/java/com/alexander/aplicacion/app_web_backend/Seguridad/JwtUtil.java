package com.alexander.aplicacion.app_web_backend.Seguridad;

import org.springframework.stereotype.Component;
import io.jsonwebtoken.*;
import java.util.Date;
import io.jsonwebtoken.security.Keys;
import java.security.Key;

@Component
public class JwtUtil {

    private Key claveSecreta = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public String generarToken(String nombreUsuario, String rol) {
        return Jwts.builder()
                .setSubject(nombreUsuario)
                .claim("rol", rol)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000)) // 1 día
                .signWith(claveSecreta)
                .compact();
    }

    public String obtenerUsuarioDelToken(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(claveSecreta)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public boolean validarToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(claveSecreta).build().parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
