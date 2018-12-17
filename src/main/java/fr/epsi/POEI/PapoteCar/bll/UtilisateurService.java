package fr.epsi.POEI.PapoteCar.bll;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.epsi.POEI.PapoteCar.dal.UtilisateurRepository;
import fr.epsi.POEI.PapoteCar.domain.Utilisateur;
import fr.epsi.POEI.PapoteCar.util.DateManipulations;

public class UtilisateurService extends GenericService<UtilisateurRepository, Utilisateur> {
	@Autowired
	UtilisateurRepository repository;
	
	public List<Utilisateur> getUtilisateursWithSameAge(Utilisateur user){
		int userAge = DateManipulations.getUserAge(user);
		List<Date> bornes = DateManipulations.getBeginAndEndDatesByAge(userAge);
		
		
		
		return new ArrayList<Utilisateur>();
	}
	
}
