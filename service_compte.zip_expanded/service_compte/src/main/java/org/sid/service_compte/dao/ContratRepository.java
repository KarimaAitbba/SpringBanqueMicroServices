package org.sid.service_compte.dao;

import org.sid.service_compte.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ContratRepository extends JpaRepository<Contrat, String>{

}
