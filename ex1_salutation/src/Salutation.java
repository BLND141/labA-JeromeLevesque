//Structure de la classe
import java.util.Scanner;

public class Salutation {

    public static void main (String[] args) {
        //Déclaration des variables et ouverture du scanner
        Scanner sc = new Scanner(System.in);
        String nom = "";
        //Affichage de la question et lecture de la réponse
        System.out.println("Bonjour, quel est ton nom?");
        nom = sc.nextLine ();
        //Affichage de la salution avec réponse
        System.out.println("Bonjour " + nom);
        //Fermeture du scanner
        sc.close();
    }
}
