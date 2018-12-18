package fr.epsi.POEI.PapoteCar.dal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.epsi.POEI.PapoteCar.domain.Trajet;

@RepositoryRestResource(path="trajets")
@CrossOrigin(origins = "*")
public interface TrajetRepository extends CrudRepository<Trajet, Long>{
	
}
