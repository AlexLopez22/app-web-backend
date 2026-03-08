
package com.alexander.aplicacion.app_web_backend.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.alexander.aplicacion.app_web_backend.Entitdades.Pelicula;

@Repository
public interface PeliculaRepositorio extends JpaRepository<Pelicula, Long> {

    List<Pelicula> findByCategoria(String categoria);
}
