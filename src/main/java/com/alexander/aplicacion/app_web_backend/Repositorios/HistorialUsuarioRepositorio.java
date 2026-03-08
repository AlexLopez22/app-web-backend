package com.alexander.aplicacion.app_web_backend.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.alexander.aplicacion.app_web_backend.Entitdades.HistorialUsuario;

@Repository
public interface HistorialUsuarioRepositorio extends JpaRepository<HistorialUsuario, Long> {

    List<HistorialUsuario> findByUsuarioId(Long usuarioId);
}
