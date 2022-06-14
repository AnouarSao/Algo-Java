import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        byte age;
        int annee;

        Scanner t = new Scanner(System. in );

        System.out.print("Entrer votre age: ");
        age = t.nextByte();

        annee = 2022 - age;

        //System.out.println("Votre annee de naissance est: "+ (2022 - age));
        System.out.println("Votre annee de naissance est: " + annee);

    }
}

/*E5.
Ecrivez un programme Age.java qui :
declare l'âge de l'utilisateur ;
lit la réponse de l'utilisateur et l'enregistre dans une variable age de type entier ;
Effectue le calcul de l'année de naissance de l'utilisateur et l'enregistre dans la variable annee de type entier ;
affiche l'année de naissance ainsi calculée.

Exemple d'exécution du programme:
age = 30
Votre année de naissance est : 1992

 */