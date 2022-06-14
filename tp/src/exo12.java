import java.util.Scanner;

public class exo12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrer le nombre de depart: ");
        int nombre = input.nextInt();

        System.out.println("Les dix chiffres suivants sont:");
        for (int i = nombre+1; i <= nombre+10; i++) {
            System.out.println(i);
        }
    }
}

/*
Exo 12.

  Ecrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants. Par exemple, si l'utilisateur entre le nombre 17, le programme affichera les nombres de 18 à 27.

 */