package Personnage;
import Armes.Magique;
import Sort.*;

/**
 * Created by gilra1731814 on 2018-02-05.
 */
public  class MagicienNoir extends Magicien {
    private Magique armes;
    public MagicienNoir (Magique armes){
        this.armes=armes;
        setNom("Magicien Noir");
        setMana(50);
        tabSort[0]=new BoolTheFeu();
        tabSort [1]=new PickTheGlace();
    }
    public int degatsArmes(){
        return armes.lancerSort();
    }
}
