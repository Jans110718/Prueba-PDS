package com.pe.cibertec.prueba.service;

import java.util.List;
import java.util.Optional;

import com.pe.cibertec.prueba.entity.Incidencia;

public interface IncidenciaService {
    public abstract List<Incidencia> listaTodos();

    public abstract Incidencia insertaActualizaIncidencia(Incidencia obj);

    public abstract Optional<Incidencia> buscaIncidencia(int idIncidencia);

    public abstract List<Incidencia> listaPorVehiculo(int id_vehiculo);

    public abstract List<Incidencia> listaPorPlacaVehiculoLike(String filtro);

    public abstract List<Incidencia> listaPorTipoIncidencia(int id_tipo_incidencia);

    public abstract List<Incidencia> listaPorEstado(int id_estado);

    public abstract List<Incidencia> listaIncidenciasActivas();

    public Incidencia actualizarIncidencia(Incidencia incidencia);
}
