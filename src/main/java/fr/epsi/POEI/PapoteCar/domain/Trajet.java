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


}
