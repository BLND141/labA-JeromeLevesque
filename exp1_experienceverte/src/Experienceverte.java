//Structure de la classe
import java.util.Scanner;

public class Experienceverte {

    public static void main (String[] args) {
        //Ouverture du scanner
        Scanner sc = new Scanner (System.in);
        //Déclaration des variables
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int co2;
        //Demande des variables et scan des réponses
        System.out.println("Entree des quantites...");
        System.out.println("A > ");
        a = sc.nextInt();
        System.out.println("B > ");
        b = sc.nextInt();
        System.out.println("C > ");
        c = sc.nextInt();
        System.out.println("D > ");
        d = sc.nextInt();
        System.out.println("E > ");
        e = sc.nextInt();
        System.out.println("F > ");
        f = sc.nextInt();
        //Affichage des variables avant réaction
        co2 = 0;
        System.out.println("A_0{" + a + "}" + " B_0{" + b + "}" + " C_0{" + c + "}" + " D_0{" + d + "}" + " E_0{" + e + "}" + " F_0{" + f + "}" + " CO2_0{" + co2 + "}");
         //Affichage réaction 1
         System.out.println("R1 : 2A + 4C => 3D + CO2");
        int k1 = (int) Math.min ((a / 2),(c / 4));
         System.out.println("> K : " + k1);
         System.out.println("> R1 : " + (2 * k1) + "A + " + (4 * k1) + "C => " + (3 * k1) + "D + " + (1 * k1) + "CO2");
        System.out.println("A_1{" + (a - 2 * k1) + "}" + " B_1{" + b + "}" + " C_1{" + (c - 4 * k1) + "}" + " D_1{" + (d + 3 * k1) + "}" + " E_1{" + e + "}" + " F_1{" + f + "}" + " CO2_1{" + (co2 + k1) + "}");
       //Affichage réaction 2
        System.out.println("R2 : B + 2C + E => 4F + 4CO2");
        int k2 = (int)  Math.min((Math.min((b),((c - 4 * k1)/2))), e);
        System.out.println("> K : " + k2);
        System.out.println("> R2 : " + k2 + "B + " + (2 * k2) + "C + " + (k2) + "E => " + (4 * k2) + "F + " + (4 * k2) + "CO2");
        System.out.println("A_2{" + (a - 2 * k1) + "} B_2{" + (b - k2) + "} C_2{" + (c - 4 * k1 - 2 * k2) + "} D_2{" + (d + 3 * k1) + "} E_2{" + (e - k2) + "} F_2{" + (f + 4 * k2) + "} CO2_2{" + (co2 + k1 + 4 * k2) + "}");
        //Affichage réaction 3
        System.out.println("R3 : A/2 + 4F => B + 4E + CO2");
        int k3 = (int) Math.min((a - 2 * k2) * 2,(f + 4 * k2)/4);
        System.out.println("> K : " + k3);
        System.out.println("> R3 : " + ((int) k3 / 2) + "A + " + (4 * k3) + "F => " + k3 + "B + " + (4 * k3) + "E + " + k3 + "CO2");
        System.out.println("A_3{" + ((a - 2 * k1) - (k3 / 2)) + "} B_3{" + ((b - k2) + k3) + "} C_3{" + (c- 4 * k1 - 2 * k2) + "} D_3{" + (d + 3 * k1) + "} E_3{" + ((e - k2) + 4 * k3) + "} F_3{" + ((f + 4 * k2) - 4 * k3) + "} CO2_3{" + ((co2 + k1 + 4 * k2) + k3) + "}");
        //Fermeture du scanner
        sc.close();
    }
}
