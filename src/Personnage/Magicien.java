package Personnage;
import Sort.*;

/**
 * Created by gilra1731814 on 2018-02-05.
 */
public abstract class Magicien extends Personnage {

    protected int mana;
    public Sort tabSort []=new Sort[2];
    int random;

    public int getMana() {return mana;}

    public void setMana(int mana) {this.mana = mana;}

    public Magicien(){
        setDef(1);
        setPv(60);

    }
    public  void attaquer (Personnage personnage1){
        random=(int)(Math.random()*2);
        if(tabSort[random].getCout()<=mana){

            System.out.println("Le "+getNom()+" attaque!");
            System.out.println("Il fait "+tabSort[random].getNom());
            System.out.println("Il reste "+getMana()+" de mana.");
            System.out.print("Le "+personnage1.getNom()+" perds ");
            tabSort[random].lancerSort(personnage1);
            System.out.println(" pv.");

            System.out.println("Il lui reste "+ personnage1.getPv());
            mana-=tabSort[random].getCout();
            System.out.println("-------------------------------------");

        }
        else
        {
            System.out.println("Vous n'avez pas assez de mana.");
        }

    }
}
