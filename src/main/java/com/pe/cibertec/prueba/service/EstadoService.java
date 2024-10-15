
package com.pe.cibertec.prueba.service;

import java.util.List;
import java.util.Optional;

import com.pe.cibertec.prueba.entity.Estado;

public interface EstadoService {
public abstract List<Estado> listaTodos();
    
    public abstract Estado insertaActualizaEstado(Estado obj);
    
    public abstract Optional<Estado> buscaEstado(int idEstado);
    
    public abstract List<Estado> listaPorNombre(String nombre);

    public Estado actualizarEstado(Estado estado);
}
