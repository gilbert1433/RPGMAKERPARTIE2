/**
 * Created by gilra1731814 on 2018-02-05.
 */
public abstract class Magicien extends Personnage {

    protected int mana;
    public Sort tabSort []=new Sort[2];

    public int getMana() {return mana;}

    public void setMana(int mana) {this.mana = mana;}

    public Magicien(){
        setDef(1);
        setPv(60);

    }
}
