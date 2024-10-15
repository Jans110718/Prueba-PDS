package com.pe.cibertec.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pe.cibertec.prueba.entity.TipoIncidencia;

public interface TipoIncidenciaRepository extends JpaRepository<TipoIncidencia, Integer> {

    @Query("SELECT t FROM TipoIncidencia t WHERE t.tipo = ?1")
    public abstract List<TipoIncidencia> buscarTipoIncidenciaPorNombre(String tipo);
}