package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Long>{

}
