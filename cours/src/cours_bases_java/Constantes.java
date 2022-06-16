package cours_bases_java;

import java.util.Scanner;

public class Constantes {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        // constante : une fois declaree, la valeur ne peut plus changer
        // on ajoute le terme final
        final double g = 9.8;

        // declaration par inference
        var pays = true;

        int age;    // 1- declaration sans initialisation
        age = 10;

        double poids = 62.1;  // 2- declaration avec initialisation
    }
}
