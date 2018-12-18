package fr.epsi.POEI.PapoteCar.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity

public class Trajet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;//Cle primaire

    @ManyToOne
    private Voyage voyage;

    private String adresse;

    private double lattitude;

    private double longitude;

    public Trajet(Voyage voyage, String adresse, double lattitude, double longitude) {
        this.voyage = voyage;
        this.adresse = adresse;
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Voyage getVoyage() {
        return voyage;
    }

    public void setVoyage(Voyage voyage) {
        this.voyage = voyage;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getLattitude() {
        return lattitude;
    }

    public void setLattitude(double lattitude) {
        this.lattitude = lattitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
