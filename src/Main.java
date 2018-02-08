import java.util.Scanner;

/**
 * Created by gilra1731814 on 2018-02-01.
 */
public class Main {
    public static void main(String[] args) {
        int choix1 = 0;
        int choix2 = 0;
        Personnage perso1=null;
        Personnage perso2=null;
        boolean choix = true;
        boolean fin=false;
        Scanner sc = new Scanner(System.in);
        int nbdetour=0;

        //personnage1
        System.out.println("Bienvenue dans RPGMAKER!");
        while (choix == true) {
            System.out.println("Veuillez choisir le personnage 1:");
            System.out.println("1.Barbare\n2.Paladin\n3.Magicien Noir\n4.Magicien Rouge");
            choix1 = sc.nextInt();
            if (choix1 <= 4&&choix1>=1) {
                System.out.println("Votre choix: " + choix1);
                choix = false;
                if (choix1 == 1) {perso1 = new Barbare();}
                else if (choix1 == 2) {perso1 = new Paladin();}
                else if (choix1 == 3) {perso1 = new MagicienNoir();}
                else if (choix1 == 4) {perso1 = new MagicienRouge();}
            }
            else System.out.println("Veuillez réssayer.");
        }
        //personnage2

        choix = true;
        while (choix == true) {
            System.out.println("Veuillez choisir le personnage 2:");
            System.out.println("1.Barbare\n2.Paladin\n3.Magicien Noir\n4.Magicien Rouge");
            choix2 = sc.nextInt();
            if (choix2 <= 4&&choix2>=1) {
                System.out.println("Votre choix: " + choix2);
                choix=false;
                if (choix2 == 1) {perso2 = new Barbare();}
                else if (choix2 == 2) {perso2 = new Paladin();}
                else if (choix2 == 3) {perso2 = new MagicienNoir();}
                else if (choix2 == 4) {perso2 = new MagicienRouge();}}
            else System.out.println("Veuillez réssayer.");
        }
        while(!fin){
            nbdetour++;
            if(nbdetour%2==1){
              perso1.attaquer(perso2);
              if(perso2.getPv()<=0){
                  System.out.println("Le "+perso1.getNom()+" a gagné!");
                  fin=true;
              }
            }
            else{
                perso2.attaquer(perso1);
                if(perso1.getPv()<=0){
                    System.out.println("Le "+perso2.getNom()+" a gagné!");
                    fin=true;
                }
            }

        }

    }

}
