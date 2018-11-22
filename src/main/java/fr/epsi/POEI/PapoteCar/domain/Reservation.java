package fr.epsi.POEI.PapoteCar.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;//Cle primaire

    @Temporal( value = TemporalType.DATE)
    private Date dateDeReservation;

    private Utilisateur passager;
    private Trajet trajet;
    private double prixPaye;
    private boolean estValide;

    public Reservation() {
    }

    public Reservation(Date dateDeReservation, Utilisateur passager, Trajet trajet, double prixPaye, boolean estValide) {
        this.dateDeReservation = dateDeReservation;
        this.passager = passager;
        this.trajet = trajet;
        this.prixPaye = prixPaye;
        this.estValide = estValide;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateDeReservation() {
        return dateDeReservation;
    }

    public void setDateDeReservation(Date dateDeReservation) {
        this.dateDeReservation = dateDeReservation;
    }

    public Utilisateur getPassager() {
        return passager;
    }

    public void setPassager(Utilisateur passager) {
        this.passager = passager;
    }

    public Trajet getTrajet() {
        return trajet;
    }

    public void setTrajet(Trajet trajet) {
        this.trajet = trajet;
    }

    public double getPrixPaye() {
        return prixPaye;
    }

    public void setPrixPaye(double prixPaye) {
        this.prixPaye = prixPaye;
    }

    public boolean isEstValide() {
        return estValide;
    }

    public void setEstValide(boolean estValide) {
        this.estValide = estValide;
    }
}
