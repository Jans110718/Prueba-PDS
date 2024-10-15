package com.pe.cibertec.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.cibertec.prueba.entity.Solicitud;
import com.pe.cibertec.prueba.repository.SolicitudRepository;

@Service
public class SolicitudServiceImp implements SolicitudService {

    @Autowired
    private SolicitudRepository solicitudRepository;

    @Override
    public List<Solicitud> listaTodos() {
        // Devuelve la lista completa de solicitudes
        return solicitudRepository.findAll();
    }

    @Override
    public Solicitud insertaActualizaSolicitud(Solicitud obj) {
        // Inserta o actualiza una solicitud
        return solicitudRepository.save(obj);
    }

    @Override
    public Optional<Solicitud> buscaSolicitud(int idSolicitud) {
        // Busca una solicitud por su ID
        return solicitudRepository.findById(idSolicitud);
    }

    @Override
    public List<Solicitud> listaPorVehiculo(int id_vehiculo) {
        // Lista solicitudes por ID de vehículo
        return solicitudRepository.listaPorVehiculo(id_vehiculo);
    }

    @Override
    public List<Solicitud> listaPorPlacaVehiculoLike(String filtro) {
        // Lista solicitudes filtradas por la placa del vehículo (con LIKE)
        return solicitudRepository.listaPorPlacaVehiculoLike(filtro);
    }

    @Override
    public List<Solicitud> listaPorEstado(int id_estado) {
        // Lista solicitudes por estado
        return solicitudRepository.listaPorEstado(id_estado);
    }

    @Override
    public List<Solicitud> listaSolicitudesActivas() {
        // Lista solicitudes activas (estado id_estado = 1)
        return solicitudRepository.listaSolicitudesActivas();
    }

    @Override
    public Solicitud actualizarSolicitud(Solicitud solicitud) {
        // Actualiza una solicitud
        return solicitudRepository.save(solicitud);
    }
}
