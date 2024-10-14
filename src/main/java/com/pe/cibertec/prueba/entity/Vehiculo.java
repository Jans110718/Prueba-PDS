package com.pe.cibertec.prueba.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_vehiculo;
    
    private String modelo;
    private String placa;
    private String marca;
    private String color;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

    public Vehiculo() {
    }

    public Vehiculo(int id_vehiculo, String modelo, String placa, String marca, String color, Estado estado) {
        this.id_vehiculo = id_vehiculo;
        this.modelo = modelo;
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.estado = estado;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    // Atributo para reporte
    public String getReporteEstado() {
        if (estado == null) {
            return "sin estado";
        }
        return estado.getEstado();
    }
}
