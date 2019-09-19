//Structure de la classe
import java.util.Scanner;

public class Vecteur {

    public static void main (String[] args) {
        //Ouverture du scanner et identifications des variables
        Scanner sc = new Scanner(System.in);
    float xa;
    float ya;
    float za;
    float xb;
    float yb;
    float zb;
    //Affichage de la question A
    System.out.println("Quel sont les coordonnes du point A?");
    //Affichage des coordonnes A et scan des réponses
    System.out.println("xa : ");
    xa = sc.nextFloat();
    System.out.println("ya : ");
    ya = sc.nextFloat();
    System.out.println("za : ");
    za = sc.nextFloat();
    //Affichage de l'ensemble des coordonnes A
    System.out.println("Le point A (" + xa + "," + ya + "," + za + ")");
    //Affichage de la question B
    System.out.println("Quel sont les coordonnes du point B?");
    //Affichage des coordonnes B et scan des réponses
    System.out.println("xb : ");
    xb = sc.nextFloat();
    System.out.println("yb : ");
    yb = sc.nextFloat();
    System.out.println("zb : ");
    zb = sc.nextFloat();
    //Affichage de l'ensemble des coordonnes B
    System.out.println("Le point B (" + xb + "," + yb + "," + zb + ")");
    //Affichage des calculs de la distance
    System.out.println("distance = SORT(POW(" + xb + "-" + xa + ") + POW(" + yb + "-" + ya + ") + POW(" + zb + "-" + za + "))");
    System.out.println("         = SORT(POW(" + (xb - xa) + ") + POW(" + (yb - ya) + ") + POW(" + (zb - za) + "))");
    System.out.println("         = SORT(" + (Math.pow((xb - xa),2)) + "+" + (Math.pow((yb - ya),2)) + "+" + (Math.pow((zb - za),2)) + ")");
    System.out.println("         = SORT(" + ((Math.pow((xb - xa),2)) + (Math.pow((yb - ya),2)) + Math.pow((zb - za),2)) + ")");
    float distance = (float) Math.sqrt(Math.pow((xb - xa),2) + Math.pow((yb - ya),2) + Math.pow((zb - za),2));
    System.out.println("         = " + distance);
    System.out.println("La distance est : " + distance);
    //Fermeture du scanner
    sc.close();
    }
}
