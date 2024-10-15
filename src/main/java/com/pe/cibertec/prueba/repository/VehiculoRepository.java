package com.pe.cibertec.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pe.cibertec.prueba.entity.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {

    public abstract List<Vehiculo> findByOrderByPlacaAsc();

    public List<Vehiculo> findByPlaca(String placa);

    public List<Vehiculo> findByPlacaIgnoreCase(String placa);

    @Query("select v from Vehiculo v where v.placa like ?1 ")
    public List<Vehiculo> listaPorPlacaLike(String filtro);

    @Query("select v from Vehiculo v where v.placa = ?1")
    public List<Vehiculo> listaPorPlacaIgual(String placa);

    @Query("select v from Vehiculo v where v.placa = ?1 and v.id_vehiculo != ?2")
    public List<Vehiculo> listaPorPlacaIgualActualiza(String placa, int id);

    @Query("select v from Vehiculo v where v.estado.id_estado = 1")
    public abstract List<Vehiculo> listaVehiculosDisponibles();
}