package com.pe.cibertec.prueba.service;

import java.util.List;
import java.util.Optional;

import com.pe.cibertec.prueba.entity.Vehiculo;

public interface VehiculoService {
	 public abstract List<Vehiculo> listaTodos();
	    
	    public abstract Vehiculo insertaActualizaVehiculo(Vehiculo obj);
	    
	    public abstract Optional<Vehiculo> buscaVehiculo(int id_vehiculo);
	    
	    public abstract List<Vehiculo> listaPorPlaca(String placa);
	    
	    public abstract List<Vehiculo> listaPorPlacaLike(String filtro);
	    
	    public abstract List<Vehiculo> listaPorPlacaIgualActualiza(String placa, int id);
	    
	    public abstract List<Vehiculo> listaVehiculosDisponibles();

	    public Vehiculo actualizarVehiculo(Vehiculo vehiculo);
}
