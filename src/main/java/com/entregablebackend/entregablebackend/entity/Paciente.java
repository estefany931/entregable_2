package com.entregablebackend.entregablebackend.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Paciente {


    @Id
    private Long cedula;

    private String nombre;

    private String apellido;

    private LocalDate fechaNacimiento;
    private String celular;
    @OneToMany(mappedBy = "paciente")
    private List<Cita> citas;


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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}