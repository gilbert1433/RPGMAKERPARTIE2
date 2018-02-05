/**
 * Created by gilra1731814 on 2018-02-01.
 */
public abstract class Guerier extends Personnage {
    protected int force;


    public  void attaquer (Personnage personnage1){
        personnage1.setPv((getForce()*2)-personnage1.getDef());
    }

    public int getForce() {return force;}
    public void setForce(int force) {this.force = force;}

}
