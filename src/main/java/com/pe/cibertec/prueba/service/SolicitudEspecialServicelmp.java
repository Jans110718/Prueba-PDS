package com.pe.cibertec.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.cibertec.prueba.entity.SolicitudEspecial;
import com.pe.cibertec.prueba.repository.SolicitudEspecialRepository;

@Service
public class SolicitudEspecialServicelmp implements SolicitudEspecialService {

    @Autowired
    private SolicitudEspecialRepository solicitudEspecialRepository;

    @Override
    public List<SolicitudEspecial> listaTodos() {
        // Devuelve la lista completa de solicitudes especiales
        return solicitudEspecialRepository.findAll();
    }

    @Override
    public SolicitudEspecial insertaActualizaSolicitudEspecial(SolicitudEspecial obj) {
        // Inserta o actualiza una solicitud especial
        return solicitudEspecialRepository.save(obj);
    }

    @Override
    public Optional<SolicitudEspecial> buscaSolicitudEspecial(int idSolicitudEspecial) {
        // Busca una solicitud especial por su ID
        return solicitudEspecialRepository.findById(idSolicitudEspecial);
    }

    @Override
    public List<SolicitudEspecial> listaPorEstado(int id_estado) {
        // Lista solicitudes especiales filtradas por el estado
        return solicitudEspecialRepository.listaPorEstado(id_estado);
    }

    @Override
    public List<SolicitudEspecial> listaSolicitudesEspecialesActivas() {
        // Lista solicitudes especiales activas
        return solicitudEspecialRepository.listaSolicitudesEspecialesActivas();
    }

    @Override
    public SolicitudEspecial actualizarSolicitudEspecial(SolicitudEspecial solicitudEspecial) {
        // Actualiza una solicitud especial
        return solicitudEspecialRepository.save(solicitudEspecial);
    }
}
