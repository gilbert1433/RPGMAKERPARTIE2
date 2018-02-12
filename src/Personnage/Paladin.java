package Personnage;

import Armes.Tranchant;

/**
 * Created by gilra1731814 on 2018-02-05.
 */
public  class  Paladin extends Guerier {
    private Tranchant armes;
    public Paladin (Tranchant armes){
        this.armes=armes;
        setForce(5);
        setDef(5);
        setPv(80);
        setNom("Paladin");
    }
    public int degatsArmes(){
        return armes.trancher();

    }
}
