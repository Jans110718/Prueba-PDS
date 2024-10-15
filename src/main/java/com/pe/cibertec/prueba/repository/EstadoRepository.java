package com.pe.cibertec.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pe.cibertec.prueba.entity.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

	 // Método explícito para listar todos los estados
    @Override
    List<Estado> findAll();

}