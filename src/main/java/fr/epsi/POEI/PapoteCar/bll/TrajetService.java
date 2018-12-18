package fr.epsi.POEI.PapoteCar.bll;

import java.util.List;

import fr.epsi.POEI.PapoteCar.util.GPSUtils;
import fr.epsi.POEI.PapoteCar.util.PointGPS;
import org.springframework.beans.factory.annotation.Autowired;

import fr.epsi.POEI.PapoteCar.dal.TrajetRepository;
import fr.epsi.POEI.PapoteCar.domain.Trajet;


public class TrajetService {
	@Autowired 
	TrajetRepository trajetRepository;

	PointGPS Coordonnees;
	Trajet trajet;
	
	public List<Trajet> findNearbyTrajetsByDestination(PointGPS CoordonneesPosition, PointGPS CoordonneesDestination){
		GPSUtils.getGPSBounds(CoordonneesPosition.getLattitude(), CoordonneesPosition.getLongitude());
		GPSUtils.getGPSBounds(trajet.getLattitude(), trajet.getLongitude());
		GPSUtils.getGPSBounds(CoordonneesDestination.getLattitude(), CoordonneesDestination.getLongitude());

        for (:
             ) {
            
        }

	}
}
