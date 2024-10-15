package com.pe.cibertec.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.cibertec.prueba.entity.Vehiculo;
import com.pe.cibertec.prueba.repository.VehiculoRepository;

@Service
public class VehiculoServiceImp implements VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public List<Vehiculo> listaTodos() {
        // Devuelve la lista completa de vehículos
        return vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo insertaActualizaVehiculo(Vehiculo obj) {
        // Inserta o actualiza un vehículo
        return vehiculoRepository.save(obj);
    }

    @Override
    public Optional<Vehiculo> buscaVehiculo(int id_vehiculo) {
        // Busca un vehículo por su ID
        return vehiculoRepository.findById(id_vehiculo);
    }

    @Override
    public List<Vehiculo> listaPorPlaca(String placa) {
        // Lista vehículos por placa exacta
        return vehiculoRepository.findByPlaca(placa);
    }

    @Override
    public List<Vehiculo> listaPorPlacaLike(String filtro) {
        // Lista vehículos filtrados por placa usando LIKE
        return vehiculoRepository.listaPorPlacaLike(filtro);
    }

    @Override
    public List<Vehiculo> listaPorPlacaIgualActualiza(String placa, int id) {
        // Lista vehículos que coinciden con la placa, pero excluyendo el vehículo con el ID dado
        return vehiculoRepository.listaPorPlacaIgualActualiza(placa, id);
    }

    @Override
    public List<Vehiculo> listaVehiculosDisponibles() {
        // Lista vehículos disponibles (estado = 1)
        return vehiculoRepository.listaVehiculosDisponibles();
    }

    @Override
    public Vehiculo actualizarVehiculo(Vehiculo vehiculo) {
        // Actualiza un vehículo
        return vehiculoRepository.save(vehiculo);
    }
}
