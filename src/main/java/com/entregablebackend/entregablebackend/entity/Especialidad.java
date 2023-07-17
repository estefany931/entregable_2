package com.entregablebackend.entregablebackend.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEspecialidad;
    private String nombre;
    @OneToMany(mappedBy = "especialidad")
    private List<Medico> medicos;

    public Especialidad(Long idEspecialidad, String nombre) {
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
    }

    public Especialidad() {
    }

    public Long getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Long idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    

    
}
