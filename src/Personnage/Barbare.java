package Personnage;

import Armes.Contondant;

/**
 * Created by gilra1731814 on 2018-02-05.
 */
public  class Barbare extends Guerier{
    private Contondant armes;
    public Barbare(Contondant armes){
        this.armes=armes;
        setForce(10);
        setDef(3);
        setPv(100);
        setNom("Barbare");
    }
    public int degatsArmes(){
        return armes.frapper();
    }
}
