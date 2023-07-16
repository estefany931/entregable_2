package com.entregablebackend.entregablebackend.entity;

import java.time.LocalDate;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Paciente { 


    @Id
    private Long cedula;

    private String nombre;

    private String apellido; 

    private String celular;

    public Paciente(Long cedula, String nombre, String apellido, String celular) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }
    

    public Paciente() {
    }


    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
    
}