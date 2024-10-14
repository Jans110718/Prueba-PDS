package com.pe.cibertec.prueba.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TipoIncidencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipo_incidencia;
    
    private String tipo;

    public TipoIncidencia() {
    }

    public TipoIncidencia(int id_tipo_incidencia, String tipo) {
        this.id_tipo_incidencia = id_tipo_incidencia;
        this.tipo = tipo;
    }

    public int getId_tipo_incidencia() {
        return id_tipo_incidencia;
    }

    public void setId_tipo_incidencia(int id_tipo_incidencia) {
        this.id_tipo_incidencia = id_tipo_incidencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
