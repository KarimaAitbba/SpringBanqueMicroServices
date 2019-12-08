package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Contrat;

public interface ContratService {
	
    public Contrat saveContrat(Contrat contrat);
    public  Contrat getContrat(long id);
    public  Contrat updateContrat(Contrat contrat);
    public  void deleteContrat(long id);
    public  List<Contrat> getContrats();

}
