/**
 * Created by gilra1731814 on 2018-02-05.
 */
public  class MagicienNoir extends Magicien {
    public MagicienNoir (){
        setNom("Magicien Noir");
        setMana(50);
        tabSort[0]=new BoolTheFeu();
        tabSort [1]=new PickTheGlace();
    }
}
