//Structure de la classe
import java.util.Scanner;
import java.text.DecimalFormat;

public class Boitenoire {

    public static void main (String[] args){
        //Ouverture du scanner et du decimalformat
        Scanner sc = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat ("#.###");
        //Déclaration des variables
        double mVolSphere;
        double poidsSphere;
        double rayonSphere;
        double volumeSphere;
        double mVolSubstanceIsolation;
        double poidsSubstanceIsolation;
        double volumeSubstanceIsolation;
        double quantiteSubstanceIsolation;
        double poidsBoite;
        double volumeBoite;
        double poidsTotal;
        //Informations connues
        mVolSphere = 3517;
        poidsBoite = 375;
        volumeBoite = 125;
        rayonSphere = 2.15;
        mVolSubstanceIsolation = 13545.88;
        //Informations à calculer
        volumeSphere = (4 * Math.PI / 3) * (Math.pow(rayonSphere,3));
        poidsSphere = volumeSphere * mVolSphere;
        volumeSubstanceIsolation = volumeBoite - volumeSphere;
        poidsSubstanceIsolation = mVolSubstanceIsolation * volumeSubstanceIsolation;
        poidsTotal = poidsBoite + poidsSphere + poidsSubstanceIsolation;
        quantiteSubstanceIsolation = volumeSubstanceIsolation * 1000;
        // Affichage du rapport d'informations
        System.out.println("-------------------------------------------");
        System.out.println("-RAPPORT D'INFORMATIONS");
        System.out.println("  Sphere");
        System.out.println("   * Masse volumique : " + df.format(mVolSphere) + " kg/m3");
        System.out.println("   * Poids : " + df.format(poidsSphere) + " kg");
        System.out.println("   * Rayon : " + df.format(rayonSphere) + " m");
        System.out.println("   * Volume : " + df.format(volumeSphere) + " m3");
        System.out.println("  Substance isolante");
        System.out.println("   * Masse volumique : " + df.format(mVolSubstanceIsolation) + " kg/m3");
        System.out.println("   * Poids : " + df.format(poidsSubstanceIsolation) + " kg");
        System.out.println("   * Volume : " + df.format(volumeSubstanceIsolation) + " m3");
        System.out.println("   * Quantite: " + df.format(quantiteSubstanceIsolation) + " l");
        System.out.println("  Boite noire");
        System.out.println("   * Poids : " + df.format(poidsBoite) + " kg");
        System.out.println("   * Volume : " + df.format(volumeBoite) + " m3");
        System.out.println("   * Poids total : " + df.format(poidsTotal) + " kg");
        System.out.println("-------------------------------------------");
        //Fermeture du scanner et du decimalformat
        sc.close();
        df.clone();
        }
}
