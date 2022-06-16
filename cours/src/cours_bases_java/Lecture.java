package cours_bases_java;

import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Votre nom: ");
        String nom = input.nextLine();
        //System.out.println(nom);

        System.out.print("Votre prenom: ");
        String prenom = input.nextLine();
        //System.out.println(prenom);

        System.out.print("Votre genre: ");
        char genre = input.next().charAt(0);
        //System.out.println(genre);

        System.out.print("Votre age: ");
        byte age = input.nextByte();
        //System.out.println(age);

        System.out.print("Votre poids: ");
        float poids= input.nextFloat();
        //System.out.println(poids);

        System.out.printf("Nom: %s\nPrenom: %s\nGenre: %c\nAge: %d\nPoids: %.2f", nom, prenom, genre, age, poids);

    }
}
