package com.entregablebackend.entregablebackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.entregablebackend.entregablebackend.entity.Paciente;

@RepositoryRestResource(collectionResourceRel = "paciente", path = "paciente")
@CrossOrigin(origins ="http://localhost:3000")
public interface PacienteRepository extends CrudRepository<Paciente,Long> { 

    
    
}
