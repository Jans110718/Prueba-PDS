package com.pe.cibertec.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.cibertec.prueba.entity.Incidencia;
import com.pe.cibertec.prueba.repository.IncidenciaRepository;

@Service
public class IncidenciaServiceImp implements IncidenciaService {

    @Autowired
    private IncidenciaRepository incidenciaRepository;

    @Override
    public List<Incidencia> listaTodos() {
        // Devuelve la lista completa de incidencias
        return incidenciaRepository.findAll();
    }

    @Override
    public Incidencia insertaActualizaIncidencia(Incidencia obj) {
        // Inserta o actualiza una incidencia
        return incidenciaRepository.save(obj);
    }

    @Override
    public Optional<Incidencia> buscaIncidencia(int idIncidencia) {
        // Busca una incidencia por su ID
        return incidenciaRepository.findById(idIncidencia);
    }

    @Override
    public List<Incidencia> listaPorVehiculo(int id_vehiculo) {
        // Lista incidencias por ID de vehículo
        return incidenciaRepository.listaPorVehiculo(id_vehiculo);
    }

    @Override
    public List<Incidencia> listaPorPlacaVehiculoLike(String filtro) {
        // Lista incidencias filtradas por la placa del vehículo (con LIKE)
        return incidenciaRepository.listaPorPlacaVehiculoLike(filtro);
    }

    @Override
    public List<Incidencia> listaPorTipoIncidencia(int id_tipo_incidencia) {
        // Lista incidencias por tipo de incidencia
        return incidenciaRepository.listaPorTipoIncidencia(id_tipo_incidencia);
    }

    @Override
    public List<Incidencia> listaPorEstado(int id_estado) {
        // Lista incidencias por estado
        return incidenciaRepository.listaPorEstado(id_estado);
    }

    @Override
    public List<Incidencia> listaIncidenciasActivas() {
        // Lista incidencias que estén activas
        return incidenciaRepository.listaIncidenciasActivas();
    }

    @Override
    public Incidencia actualizarIncidencia(Incidencia incidencia) {
        // Actualiza una incidencia
        return incidenciaRepository.save(incidencia);
    }
}
