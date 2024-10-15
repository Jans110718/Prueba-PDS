package com.pe.cibertec.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.cibertec.prueba.entity.Estado;
import com.pe.cibertec.prueba.repository.EstadoRepository;

@Service
public class EstadoServiceImp implements EstadoService {

    @Autowired
    private EstadoRepository repository;

    @Override
    public List<Estado> listaTodos() {
        return repository.findAll();
    }
}
