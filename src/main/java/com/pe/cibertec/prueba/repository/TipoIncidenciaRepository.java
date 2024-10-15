package com.pe.cibertec.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pe.cibertec.prueba.entity.TipoIncidencia;

public interface TipoIncidenciaRepository extends JpaRepository<TipoIncidencia, Integer> {

	@Override
    List<TipoIncidencia> findAll();
}