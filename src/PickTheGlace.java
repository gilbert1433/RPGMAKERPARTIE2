/**
 * Created by gilra1731814 on 2018-02-05.
 */
public class PickTheGlace extends Sort {
    public PickTheGlace(){
        setCout(5);
        setNom("PickTheGlace");
    }
    public void lancerSort (Personnage personnage1){
        personnage1.setPv((personnage1.getPv()-7)-personnage1.getDef());
    }
}
