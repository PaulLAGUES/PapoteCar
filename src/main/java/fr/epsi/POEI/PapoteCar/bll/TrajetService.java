package fr.epsi.POEI.PapoteCar.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.epsi.POEI.PapoteCar.dal.TrajetRepository;
import fr.epsi.POEI.PapoteCar.domain.Trajet;

public class TrajetService {
	@Autowired 
	TrajetRepository trajetRepository;
	
	public List<Trajet> findNearbyTrajetsByDestination(double posLat, double posLong, double destLat, double destLong){
		GPSUtils.getGPSBounds()
	}
}
