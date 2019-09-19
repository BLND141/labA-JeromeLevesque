//Structure de la classe
import java.util.Scanner;

public class Pythagore {

    public static void main (String[] args) {
        //Déclaration des variables et ouverture du scanner
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        //Affichage de la question 1 et scan de la réponse
        System.out.println("Quel est la valeur A?");
        A = sc.nextInt();
        //Affichage de la question 2 et scan de la réponse
        System.out.println("Quel est la valeur b?");
        B = sc.nextInt();
        //Calcul de pythagore
      int  C = (int) Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
      //Affichage de la valeur de pythagore
        System.out.println("Valeur de pythagore : " + C);
        //Fermeture du scanner
        sc.close();
        }
}
