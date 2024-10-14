
package com.pe.cibertec.prueba.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class SolicitudEspecial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_solicitud_especial;
    
    private LocalDate fecha;
    private LocalTime hora;
    private String motivoIngreso;
    private String nombreConductor;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

    public SolicitudEspecial() {
    }

    public SolicitudEspecial(int id_solicitud_especial, LocalDate fecha, LocalTime hora, String motivoIngreso, String nombreConductor, Estado estado) {
        this.id_solicitud_especial = id_solicitud_especial;
        this.fecha = fecha;
        this.hora = hora;
        this.motivoIngreso = motivoIngreso;
        this.nombreConductor = nombreConductor;
        this.estado = estado;
    }

    public int getId_solicitud_especial() {
        return id_solicitud_especial;
    }

    public void setId_solicitud_especial(int id_solicitud_especial) {
        this.id_solicitud_especial = id_solicitud_especial;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getMotivoIngreso() {
        return motivoIngreso;
    }

    public void setMotivoIngreso(String motivoIngreso) {
        this.motivoIngreso = motivoIngreso;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
