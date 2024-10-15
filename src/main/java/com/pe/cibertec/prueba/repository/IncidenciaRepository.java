package com.pe.cibertec.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pe.cibertec.prueba.entity.Incidencia;

public interface IncidenciaRepository extends JpaRepository<Incidencia, Integer> {

    @Query("select i from Incidencia i where i.vehiculo.placa like ?1")
    public List<Incidencia> listaPorPlacaVehiculoLike(String filtro);

    @Query("select i from Incidencia i where i.vehiculo.id_vehiculo = ?1")
    public List<Incidencia> listaPorVehiculo(int idVehiculo);

    @Query("select i from Incidencia i where i.tipoIncidencia.id_tipo_incidencia = ?1")
    public List<Incidencia> listaPorTipoIncidencia(int idTipoIncidencia);

    @Query("select i from Incidencia i where i.estado.id_estado = ?1")
    public List<Incidencia> listaPorEstado(int idEstado);

    @Query("select i from Incidencia i where i.estado.id_estado = 1")
    public abstract List<Incidencia> listaIncidenciasActivas();
}