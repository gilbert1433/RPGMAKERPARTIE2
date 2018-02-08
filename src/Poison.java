/**
 * Created by gilra1731814 on 2018-02-05.
 */
public class Poison extends Sort {
    int nbtour=0;
    public Poison(){
        setCout(2);
        setNom("Poison");
    }
    public void lancerSort(Personnage personnage1){
        System.out.println((2+(2*nbtour)));
        personnage1.setPv(personnage1.getPv()-(2+(2*nbtour)));
        nbtour++;
    }
}
