package Sort;

import Personnage.*;

/**
 * Created by gilra1731814 on 2018-02-05.
 */
public class CoupMortel extends Sort{
    public CoupMortel(){
        setCout(10);
        setNom("CoupMortel");
    }
    public void lancerSort(Personnage personnage1, Magicien magicien){
        int random=(int)(Math.random()*10+1);
        if(random==1) {
            System.out.println(personnage1.getPv());
            personnage1.setPv(0);
        }
        else{
            System.out.println(0);
        }
    }
}
