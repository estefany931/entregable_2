package com.entregablebackend.entregablebackend.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cita;

    private LocalDate fecha_cita ; 
    @ManyToOne
    @JoinColumn(name="cedula")
    private Paciente paciente;
    @ManyToOne
    @JoinColumn(name="tarjeta_profesional")
    private Medico medico;

    public Cita() {
    }


    public Long getId_cita() {
        return id_cita;
    }

    public void setId_cita(Long id_cita) {
        this.id_cita = id_cita;
    }

    public LocalDate getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(LocalDate fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    
    
}
