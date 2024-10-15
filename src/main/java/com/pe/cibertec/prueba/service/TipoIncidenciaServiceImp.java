package com.pe.cibertec.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.cibertec.prueba.entity.TipoIncidencia;
import com.pe.cibertec.prueba.repository.TipoIncidenciaRepository;

@Service
public class TipoIncidenciaServiceImp implements TipoIncidenciaService {

    @Autowired
    private TipoIncidenciaRepository repository;

    @Override
    public List<TipoIncidencia> listaTodos() {
        return repository.findAll();
    }
}