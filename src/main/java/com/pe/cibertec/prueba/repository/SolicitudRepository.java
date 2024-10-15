package com.pe.cibertec.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pe.cibertec.prueba.entity.Solicitud;

public interface SolicitudRepository extends JpaRepository<Solicitud, Integer> {

    @Query("select s from Solicitud s where s.vehiculo.placa like ?1")
    public List<Solicitud> listaPorPlacaVehiculoLike(String filtro);

    @Query("select s from Solicitud s where s.vehiculo.id_vehiculo = ?1")
    public List<Solicitud> listaPorVehiculo(int idVehiculo);

    @Query("select s from Solicitud s where s.estado.id_estado = ?1")
    public List<Solicitud> listaPorEstado(int idEstado);

    @Query("select s from Solicitud s where s.estado.id_estado = 1")
    public abstract List<Solicitud> listaSolicitudesActivas();
}