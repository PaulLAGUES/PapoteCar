package fr.epsi.POEI.PapoteCar.dal;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.epsi.POEI.PapoteCar.domain.Utilisateur;

@RepositoryRestResource(path="users")
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long>/*extends GenericRepository<Utilisateur>*/ {
	
	@Query(
		value = "SELECT * FROM Utilisateur u WHERE u.dateDeNaissance BETWEEN ? AND ?", 
		nativeQuery = true
	)
	List<Utilisateur> findUtilisateurByDateDeNaissanceBetween(Date debut, Date fin);
}
