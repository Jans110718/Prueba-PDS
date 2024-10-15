package com.pe.cibertec.prueba.service;

import java.util.List;
import java.util.Optional;

import com.pe.cibertec.prueba.entity.TipoIncidencia;



public interface TipoIncidenciaService {

    public abstract List<TipoIncidencia> listaTodos();
    
    public abstract TipoIncidencia insertaActualizaTipoIncidencia(TipoIncidencia obj);
    
    public abstract Optional<TipoIncidencia> buscaTipoIncidencia(int idTipoIncidencia);
    
    public abstract List<TipoIncidencia> listaPorNombre(String nombre);

    public abstract List<TipoIncidencia> listaPorNombreLike(String filtro);

    public TipoIncidencia actualizarTipoIncidencia(TipoIncidencia tipoIncidencia);
}