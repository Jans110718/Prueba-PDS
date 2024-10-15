package com.pe.cibertec.prueba.service;

import java.util.List;
import java.util.Optional;

import com.pe.cibertec.prueba.entity.Solicitud;

public interface SolicitudService {
public abstract List<Solicitud> listaTodos();
    
    public abstract Solicitud insertaActualizaSolicitud(Solicitud obj);
    
    public abstract Optional<Solicitud> buscaSolicitud(int idSolicitud);
    
    public abstract List<Solicitud> listaPorVehiculo(int id_vehiculo);
    
    public abstract List<Solicitud> listaPorPlacaVehiculoLike(String filtro);
    
    public abstract List<Solicitud> listaPorEstado(int id_estado);
    
    public abstract List<Solicitud> listaSolicitudesActivas();

    public Solicitud actualizarSolicitud(Solicitud solicitud);
}
