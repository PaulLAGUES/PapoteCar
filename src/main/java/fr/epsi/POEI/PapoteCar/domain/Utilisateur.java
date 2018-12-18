package fr.epsi.POEI.PapoteCar.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;//Cle primaire

    @ManyToOne
    private Room room;

    private String prenom;
    private String nom;
    private String login;
    private String motDePasse;
    private String email;
    private String carteIdentite;
    private String permis;
    private String token;

    

    @Temporal( value = TemporalType.DATE)
    private Date dateDeNaissance;

    public Utilisateur() {
    }

    public Utilisateur(String prenom, String nom, String login, String motDePasse, String email, String carteIdentite, String permis, Date dateDeNaissance) {
        this.prenom = prenom;
        this.nom = nom;
        this.login = login;
        this.motDePasse = motDePasse;
        this.email = email;
        this.carteIdentite = carteIdentite;
        this.permis = permis;
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {return id; }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCarteIdentite(String carteIdentite) {
        this.carteIdentite = carteIdentite;
    }

    public void setPermis(String permis) {
        this.permis = permis;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

	public String getPrenom() {
		return prenom;
	}

	public String getNom() {
		return nom;
	}

	public String getLogin() {
		return login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public String getEmail() {
		return email;
	}

	public String getCarteIdentite() {
		return carteIdentite;
	}

	public String getPermis() {
		return permis;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

    public String getToken() { return token; }

    public void setToken(String token) { this.token = token; }
    
}
