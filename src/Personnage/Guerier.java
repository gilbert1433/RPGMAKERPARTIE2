package Personnage;

/**
 * Created by gilra1731814 on 2018-02-01.
 */
public abstract class Guerier extends Personnage {
    protected int force;


    public  void attaquer (Personnage personnage1){
        System.out.println("Le "+getNom()+" attaque!");
        personnage1.setPv(personnage1.getPv()-((getForce()*2)-personnage1.getDef()));
        System.out.println("Le "+personnage1.getNom()+" perds "+((getForce()*2)-personnage1.getDef())+" pv.");
        System.out.println("Il lui reste "+personnage1.getPv()+ "pv.");
        System.out.println("-------------------------------------");
    }

    public int getForce() {return force;}
    public void setForce(int force) {this.force = force;}

}
