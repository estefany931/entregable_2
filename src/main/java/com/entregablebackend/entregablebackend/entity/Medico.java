package com.entregablebackend.entregablebackend.entity;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.mapping.List;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;

public class Medico {

    @Id
    private Long tarjetaProfesional;
    private String nombre;
    private String apellido;
    private String consultorio;
    private String telefono;
    private String email;
    @OneToMany(mappedBy = "medico")
    private List<Medico> medico;
    @ManyToOne
    @JoinColumn(name = "idEspecialidad")
    private Especialidad especialidad;

    public Medico(Long tarjetaProfesional, String nombre, String apellido, String consultorio, String telefono,
            String email, Especialidad especialidad) {
        this.tarjetaProfesional = tarjetaProfesional;
        this.nombre = nombre;
        this.apellido = apellido;
        this.consultorio = consultorio;
        this.telefono = telefono;
        this.email = email;
        this.especialidad = especialidad;
    }
    

    public Medico() {
    }


    public Long getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(Long tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
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

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

}
