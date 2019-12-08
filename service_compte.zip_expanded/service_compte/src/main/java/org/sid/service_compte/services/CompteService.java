package org.sid.service_compte.services;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.sid.service_compte.dao.AbonneRepository;
import org.sid.service_compte.dao.CarteBancaireRepository;
import org.sid.service_compte.dao.CompteRepository;
import org.sid.service_compte.dao.OperationRepository;
import org.sid.service_compte.entities.Abonne;
import org.sid.service_compte.entities.CarteBancaire;
import org.sid.service_compte.entities.Compte;
import org.sid.service_compte.entities.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CompteService {
	@Autowired
	CompteRepository compteRepository;
	@Autowired
	AbonneRepository abonneRepository;
	
	@Autowired
	CarteBancaireRepository carteBancaireRepository;
	public List<Compte> findAllAccounts(Long id)
	{
        Abonne abonne=abonneRepository.getOne(id);
       return (List<Compte>) abonne.getComptes();
    }
	public List<Operation> findAllOperations(Long idCompte)
	{
		Compte compte =compteRepository.getOne(idCompte);
		return compte.getOperations();
	}
	public CarteBancaire findAllCarteBancaire(Long idCompte)
	{
		Compte compte =compteRepository.getOne(idCompte);
		return  compte.getCarteBancaire();
	}
	public void DesactiveEtatCarte(String idCarte)
	{
		CarteBancaire carte = carteBancaireRepository.getOne(idCarte);
		
		 carte.setEtat("desactiver");
		
		 carteBancaireRepository.save(carte);
			
			
	}
	public void ActiveEtatCarte(String idCarte)
	{
		CarteBancaire carte = carteBancaireRepository.getOne(idCarte);
		
		 carte.setEtat("active");
		
		 carteBancaireRepository.save(carte);
			
			
	}
	
	
	
	
	
	
	
	
	
	
	//Test
	/*public int getDate(Long idCompte)
	{
	
	Compte c= compteRepository.getOne(idCompte);
	Date datecreation= c.getDateCreation();
	Date aujoourduit = new Date();
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate date1 = LocalDate.parse((CharSequence) datecreation, format);
	LocalDate date2 = LocalDate.parse((CharSequence) aujoourduit, format);
	Period  duration = Period.between(date1, date2);
    int jours=duration.getDays();
	return jours;
	}
*/
}
