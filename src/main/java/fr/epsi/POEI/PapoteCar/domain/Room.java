package fr.epsi.POEI.PapoteCar.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;//Cle primaire
    private List<Message> listeMessages;
    private List<Utilisateur> utilisateurs;
    private Trajet voyage;
    private String nomSalleConversation;


    public Room() {
    }

    public Room(List<Message> listeMessages, List<Utilisateur> utilisateurs, Trajet voyage, String nomSalleConversation) {
        this.listeMessages = listeMessages;
        this.utilisateurs = utilisateurs;
        this.voyage = voyage;
        this.nomSalleConversation = nomSalleConversation;
    }

    public List<Message> getListeMessages() {
        return listeMessages;
    }

    public void setListeMessages(List<Message> listeMessages) {
        this.listeMessages = listeMessages;
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public Trajet getVoyage() {
        return voyage;
    }

    public void setVoyage(Trajet voyage) {
        this.voyage = voyage;
    }

    public String getNomSalleConversation() {
        return nomSalleConversation;
    }

    public void setNomSalleConversation(String nomSalleConversation) {
        this.nomSalleConversation = nomSalleConversation;
    }
}
