package com.example.demo.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.AbonneRepository;
import com.example.demo.entities.Abonne;

@Service
public class AbonneServiceImp implements AbonneService{

	@Autowired
    AbonneRepository abonneRepository;
	
	@Override
	public Abonne saveAbonne(Abonne abonne) {
		return abonneRepository.save(abonne);
	}

	@Override
	public Abonne getAbonne(long id) {
		return abonneRepository.getOne(id);
	}

	@Override
	public Abonne updateAbonne(Abonne abonne) {
		return abonneRepository.save(abonne);
	}

	@Override
	public void deleteAbonne(long id) {
		abonneRepository.deleteById(id);
		
	}

	@Override
	public void activateAbonne(long id) {
		Abonne abonne = getAbonne(id);
        abonne.setIsActivated(true);
        abonneRepository.save(abonne); 
		
	}

	@Override
	public void desactivateAbonne(long id) {
		Abonne abonne = getAbonne(id);
        abonne.setIsActivated(false);
        abonneRepository.save(abonne); 
		
	}

	@Override
	public List<Abonne> getAbonnes() {
		return abonneRepository.findAll();
	}

}
