//Structure de la classe
import java.util.Scanner;

public class Resolution {

    public static void main (String[] args) {
        //Ouverture du scanner et déclaration des variables
        Scanner sc = new Scanner (System.in);
        double a ;
        double b;
        double c;
        //Génération aléatoire des variables et affichage de celles-ci
        System.out.println("Entree des valeurs...");
       // a = sc.nextDouble();
        a = Math.random() * 50 + 10;
        System.out.println("a > " + a);
        // b = sc.nextDouble();
        b = Math.random() * 50 + 10;
        System.out.println("b > " + b);
       // c = sc.nextDouble();
        c = Math.random() * 50 + 10;
        System.out.println("c > " + c);
        //Affichage de l'équation
        System.out.println("Équation : " + a + "x2 + " + b + "x + " + c + " = 0");
        //Calcul du discriminant et affichage de la réponse
        double d = Math.pow(b,2) - 4 * a * c;
        System.out.println("Discriminant : " + d);
        //Calculs et affichages des x
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        System.out.println("X1 : " + x1);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println("X2 : " + x2);
        //Fermeture du scanner
        sc.close();
    }
}
