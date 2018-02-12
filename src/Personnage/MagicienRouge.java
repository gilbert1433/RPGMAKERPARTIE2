package Personnage;

import Armes.Magique;
import Sort.*;

/**
 * Created by gilra1731814 on 2018-02-05.
 */
public  class MagicienRouge extends Magicien {

    private Magique armes;
    public MagicienRouge(Magique armes){
        this.armes=armes;
        setNom("Magicien Rouge");
        setMana(40);
        tabSort[0]=new CoupMortel();
        tabSort[1]=new Poison();
    }
    public int degatsArmes(){
        return armes.lancerSort();
    }


}
