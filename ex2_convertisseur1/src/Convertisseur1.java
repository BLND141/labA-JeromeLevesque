//Structure de la classe
import java.util.Scanner;

public class Convertisseur1 {

    public static void main (String[] args) {
        //Déclaration de la variable angle et ouverture du scanner
        Scanner sc = new Scanner (System.in);
        double angle;
        //Affichage de la question et scan de la réponse
        System.out.println("Quel est l'angle en radian?");
        angle = sc.nextDouble();
        //calcul de l'angle en degré
        int anglefinal = (int) Math.round(angle * 180 / Math.PI);
        //Affichage de l'angle en degré
        System.out.println("Valeur en degre : " + anglefinal);
       //Fermeture du scanner
        sc.close();
        }
}
