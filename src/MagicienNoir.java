/**
 * Created by gilra1731814 on 2018-02-05.
 */
public abstract class MagicienNoir extends Magicien {
    public MagicienNoir (){
        setMana(50);
        tabSort[0]=new BoolTheFeu();
        tabSort [1]=new PickTheGlace();
    }
}
