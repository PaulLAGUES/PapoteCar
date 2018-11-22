package fr.epsi.POEI.PapoteCar.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

public class Voyage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;//Cle primaire

    @OneToMany(mappedBy="voyage", cascade = CascadeType.ALL)
    private List<Trajet> trajets;
    private Utilisateur conducteur;

    @ManyToOne
    private Adresse adresseDepart;

    @ManyToOne
    private Adresse adresseArrivee;

    public Voyage() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Trajet> getTrajets() {
        return trajets;
    }

    public void setTrajets(List<Trajet> trajets) {
        this.trajets = trajets;
    }

    public Utilisateur getConducteur() {
        return conducteur;
    }

    public void setConducteur(Utilisateur conducteur) {
        this.conducteur = conducteur;
    }

    public Adresse getAdresseDépart() {
        return adresseDepart;
    }

    public void setAdresseDépart(Adresse adresseDépart) {
        this.adresseDepart = adresseDépart;
    }

    public Adresse getAdresseArrivee() {
        return adresseArrivee;
    }

    public void setAdresseArrivee(Adresse adresseArrivee) {
        this.adresseArrivee = adresseArrivee;
    }
}
