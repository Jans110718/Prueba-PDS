package com.pe.cibertec.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pe.cibertec.prueba.entity.SolicitudEspecial;

public interface SolicitudEspecialRepository extends JpaRepository<SolicitudEspecial, Integer> {

    @Query("select se from SolicitudEspecial se where se.estado.id_estado = ?1")
    public List<SolicitudEspecial> listaPorEstado(int idEstado);

    @Query("select se from SolicitudEspecial se where se.estado.id_estado = 1")
    public abstract List<SolicitudEspecial> listaSolicitudesEspecialesActivas();
}
