package Sort;

import Personnage.*;

/**
 * Created by gilra1731814 on 2018-02-05.
 */
public class BoolTheFeu extends Sort {
    public BoolTheFeu(){
        setCout(5);
        setNom("BoolTheFeu");
    }
    public void lancerSort (Personnage personnage1, Magicien magicien){
        System.out.println(5+magicien.degatsArmes());
        personnage1.setPv(personnage1.getPv()-(5+magicien.degatsArmes()));
    }
}
