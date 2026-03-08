package com.alexander.aplicacion.app_web_backend.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.alexander.aplicacion.app_web_backend.Entitdades.Anuncio;

@Repository
public interface AnuncioRepositorio extends JpaRepository<Anuncio, Long> {

}
