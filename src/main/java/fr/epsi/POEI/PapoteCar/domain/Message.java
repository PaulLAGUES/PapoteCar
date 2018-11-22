package fr.epsi.POEI.PapoteCar.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;//Cle primaire

    private String expediteur;
    private String message;

    @ManyToOne
    private Room room;

    public Message() {
    }

    public Message(String expediteur, String message) {
        this.expediteur = expediteur;
        this.message = message;
    }

    public String getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(String expediteur) {
        this.expediteur = expediteur;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
