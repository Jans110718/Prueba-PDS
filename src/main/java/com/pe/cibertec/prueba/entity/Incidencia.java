package com.pe.cibertec.prueba.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Incidencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_incidencia;
    
    @ManyToOne
    @JoinColumn(name = "id_tipo_incidencia")
    private TipoIncidencia tipoIncidencia;
    
    private String descripcion;
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "id_vehiculo")
    private Vehiculo vehiculo;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

    public Incidencia() {
    }

    public Incidencia(int id_incidencia, TipoIncidencia tipoIncidencia, String descripcion, LocalDate fecha, Vehiculo vehiculo, Estado estado) {
        this.id_incidencia = id_incidencia;
        this.tipoIncidencia = tipoIncidencia;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.vehiculo = vehiculo;
        this.estado = estado;
    }

    public int getId_incidencia() {
        return id_incidencia;
    }

    public void setId_incidencia(int id_incidencia) {
        this.id_incidencia = id_incidencia;
    }

    public TipoIncidencia getTipoIncidencia() {
        return tipoIncidencia;
    }

    public void setTipoIncidencia(TipoIncidencia tipoIncidencia) {
        this.tipoIncidencia = tipoIncidencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
