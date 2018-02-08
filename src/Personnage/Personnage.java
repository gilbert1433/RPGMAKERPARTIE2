package Personnage;

/**
 * Created by gilra1731814 on 2018-02-01.
 */
public abstract class Personnage {
    protected int pv=0;
    protected int def=0;
    protected String nom;

    public int getPv() {return pv;}

    public void setPv(int pv) {this.pv = pv;}

    public int getDef() {return def;}

    public void setDef(int def) {this.def = def;}

    public String getNom() {return nom;}

    public void setNom(String nom) {this.nom = nom;}

    public abstract void attaquer (Personnage personnage);

}
