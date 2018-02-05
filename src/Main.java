import java.util.Scanner;

/**
 * Created by gilra1731814 on 2018-02-01.
 */
public class Main {
    public static void main(String[] args) {
        int choix1=0;
        int choix2=0;
        Scanner sc=new Scanner(System.in) ;

        //personnage1
        System.out.println("Bienvenue dans RPGMAKER!");
        System.out.println("Veuillez choisir le personnage 1:");
        System.out.println("1.Barbare\n2.Paladin\n3.Magicien Noir\n4.Magicien Rouge");
        choix1=sc.nextInt();
        if (choix1<=4) {
            System.out.println("Votre choix: " + choix1);
        }
        //personnage2
        System.out.println("Veuillez choisir le personnage 2:");
        System.out.println("1.Barbare\n2.Paladin\n3.Magicien Noir\n4.Magicien Rouge");
        choix2=sc.nextInt();
        if (choix2<=4) {
            System.out.println("Votre choix: " + choix2);
        }
        while (choix1==1){

        }
    }
}
