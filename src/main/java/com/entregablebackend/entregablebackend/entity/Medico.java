package com.entregablebackend.entregablebackend.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ManyToAny;

import java.util.List;

@Entity
@Data
public class Medico {
    @Id
    private Long tarjetaProfesional;
    private String nombre;
    private String apellido;
    private String consultorio;
    private String telefono;
    private String email;
    @OneToMany(mappedBy = "medico")
    private List<Cita> citas;
    @ManyToOne
    @JoinColumn(name = "id_especialidad")
    private Especialidad especialidad;

    public Medico() {
    }

}
