package tp_bases_java;

import java.util.Scanner;

public class exo4 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        int aPrime;
        int bPrime;
        int cPrime;

        Scanner t = new Scanner(System. in );

        System.out.print("Entrer a: ");
        a = t.nextInt();

        System.out.print("Entrer b: ");
        b = t.nextInt();

        System.out.print("Entrer C: ");
        c = t.nextInt();

        aPrime = c;
        bPrime = a;
        cPrime = b;

        System.out.println("Les valeurs entrees sont: a=" + a + ", b=" + b + " et c=" + c);

        //System.out.println("Les valeurs permutees sont: a=" + c + ", b=" + a + " et c=" + b);

        System.out.println("Les valeurs permutees sont: a=" + aPrime + ", b=" + bPrime + " et c=" + cPrime);

    }
}
/*
E4.
        Ecrire un programme Java qui déclare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
        Exemple :
        Entrez la première valeur(a) : 51
        Entrez la deuxième valeur(b) : 876
        Entrez la troisième valeur(c) : 235
        Les valeurs entrées sont : a = 51, b = 876 et c = 235
        Permutation: b <== a, c <== b, a <== c
        Les valeurs permutées sont : a = 235, b = 51 et c = 876


 */