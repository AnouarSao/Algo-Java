package cours_bases_java;

public class Variables {
    public static void main(String[] args) {
        // Les variables et les fonctions en Java sont en camelCase
        // Les classes vont etre en PascalCase

        byte age = 18; //la variable ne peut stocker que des entiers

        // Calcul rectangle
        int longueur = 50;
        int largeur = 25;
        int surface = longueur * largeur;
        int perimetre = 2 * (longueur + largeur);
        System.out.println(surface);
        System.out.println(perimetre);

        // Calcul de la vitesse moyenne en MRU
        float distanceParcourue = 90.6F;
        float temps = 12.354F;
        double vitesseMoyenne = distanceParcourue / temps;
        double vitesseMoyenne2 = 23.6780;

        // Calcul somme des nombres
        float nombre1 = 150.5F;

        // Chaine de caracteres et caracters
        String prenom = "Anouar"; // chaine de caracteres
        char genre ='M';

    }
}
