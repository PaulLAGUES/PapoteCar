package fr.epsi.POEI.PapoteCar.domain;

import java.io.Serializable;

public class Notation implements Serializable {

    private Utilisateur notant;
    private Utilisateur note;
    private Trajet trajet;
    private float valeurNote;

    public Notation() {
    }

    public Notation(Utilisateur notant, Utilisateur note, Trajet trajet, float valeurNote) {
        this.notant = notant;
        this.note = note;
        this.trajet = trajet;
        this.valeurNote = valeurNote;
    }

    public Utilisateur getNotant() {
        return notant;
    }

    public void setNotant(Utilisateur notant) {
        this.notant = notant;
    }

    public Utilisateur getNote() {
        return note;
    }

    public void setNote(Utilisateur note) {
        this.note = note;
    }

    public Trajet getTrajet() {
        return trajet;
    }

    public void setTrajet(Trajet trajet) {
        this.trajet = trajet;
    }

    public float getValeurNote() {
        return valeurNote;
    }

    public void setValeurNote(float valeurNote) {
        this.valeurNote = valeurNote;
    }
}
