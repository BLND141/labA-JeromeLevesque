//Structure de la classe

public class Geometrie {

    public static void main (String[] args) {
        //Affichage des parametres du cercle
        System.out.println("Le cercle");
        System.out.println(" - Rayon      : 10.0");
        float surfacecercle = (float) (Math.PI * Math.pow(10,2));
        System.out.println(" - Surface    : " + surfacecercle);
        //Affichage des parametres du cube
        System.out.println("Le cube");
        System.out.println(" - Longueur   : 7.0");
        float surfacecube = (float) (6 * Math.pow(7,2));
        System.out.println(" - Surface    : " + surfacecube);
        float volumecube = (float) (Math.pow(7,3));
        System.out.println(" - Volume     : " + volumecube);
        //Affichage des parametres du cylindre
        System.out.println("Le cylindre");
        System.out.println(" - Rayon      : 10.0");
        System.out.println(" - Hauteur    : 5.0");
        float surfacecylindre = (float) (2 * surfacecercle + 2 * Math.PI * 10 * 5);
        System.out.println(" - Surface    : " + surfacecylindre);
        float volumecylindre = (float) (surfacecercle * 5);
        //Affichage des parametres du cone
        System.out.println("Le cone");
        System.out.println(" - Rayon      : 3.0");
        System.out.println(" - Hauteur    : 7.0");
        float apotheme = (float) (Math.sqrt(Math.pow(3,2) + Math.pow(7,2)));
        System.out.println(" - Apotheme   : " + apotheme);
        float surfacecone = (float) (Math.PI * Math.pow(3,2) + Math.PI * 3 * apotheme);
        System.out.println(" - Surface    : " + surfacecone);
        float volumecone = (float) (Math.PI * Math.pow(3,2) * 7 / 3);
        System.out.println(" - Volume     : " + volumecone);
    }
}
