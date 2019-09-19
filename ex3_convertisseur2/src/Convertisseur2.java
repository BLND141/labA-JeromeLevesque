//structure de la classe
import java.text.DecimalFormat;
import java.util.Scanner;

public class Convertisseur2 {

    public static void main (String[] args) {
        //ouverture du decimalformat (2 chiffres après la virgule) et du scanner
        DecimalFormat df = new DecimalFormat ("#.##");
        Scanner sc = new Scanner (System.in);
        //Déclaration de la variable angle
        int angle;
        //Affichage de la question et scan de la réponse
        System.out.println("Quel est l'angle en degre?");
        angle = sc.nextInt();
        //calcul de l'angle final
        double anglefinal = angle * Math.PI / 180;
        //Affichage de l'angle en radian
        System.out.println("Valeur en radian " + df.format(anglefinal));
        //Fermeture du decimalformat et du scanner
        df.clone();
        sc.close();
    }
}
