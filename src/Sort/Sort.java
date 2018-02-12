package Sort;

import Personnage.*;

/**
 * Created by gilra1731814 on 2018-02-05.
 */
public abstract class Sort {
    private int cout=0;
    private String nom;


    public String getNom() {return nom;}

    public void setNom(String nom) {this.nom = nom;}

    public int getCout() {return cout;}

    public void setCout(int cout) {this.cout = cout;}

    public void lancerSort(Personnage personnage1, Magicien magicien){}


}
