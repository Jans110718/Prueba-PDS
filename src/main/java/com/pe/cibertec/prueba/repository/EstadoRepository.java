package com.pe.cibertec.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pe.cibertec.prueba.entity.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

    @Query("SELECT e FROM Estado e WHERE e.estado = ?1")
    public abstract List<Estado> buscarEstadoPorNombre(String estado);

}