package tp_bases_java;

import java.util.Scanner;

public class exo9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrer le numero du mois: ");
        byte numero = input.nextByte();

        String mois;

        switch (numero){
            case 1:
                mois = "Janvier";
                break;
            case 2:
                mois = "Fevrier";
                break;
            case 3:
                mois = "Mars";
                break;
            case 4:
                mois = "Avril";
                break;
            case 5:
                mois = "Mai";
                break;
            case 6:
                mois = "Juin";
                break;
            case 7:
                mois = "Juillet";
                break;
            case 8:
                mois = "Aout";
                break;
            case 9:
                mois = "Septembre";
                break;
            case 10:
                mois = "Octobre";
                break;
            case 11:
                mois = "Novembre";
                break;
            case 12:
                mois = "Decembre";
                break;
            default:
                mois = "erreur";
        }
        System.out.printf("Le mois est %s", mois);
    }
}

/*Exercice 9
Ecrire un programme qui permet à l'utilisateur de saisir un entier entre 1 et 12 et qui affiche le nom du mois correspondant.

Ex:
Mois : 4
Résult : Avril

Pour cet exercices, vous devez aussi présenter une version qui utilise le sélecteur de cas(à trouver sur internet)

 */
