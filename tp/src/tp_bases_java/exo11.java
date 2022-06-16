package tp_bases_java;

import java.util.Scanner;

public class exo11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrer un nombre: ");
        int nombre = input.nextInt();

        if(nombre == 0){
            System.out.println("La factorielle de 0 est 1");
        }else{
            int factorielle = 1;
            for (int i = 1; i <= nombre ; i++) {
                factorielle = factorielle* i;
            }
            System.out.printf("La factorielle de %d est: %d", nombre, factorielle);
        }

    }
}

/*
Exo 11.
        Écrivez un programme Java qui demande à l'utilisateur d'entrer un nombre et qui ensuite va calculer et afficher la factorielle de ce nombre:

        Ex:

        Nombre : 3

        Factorielle de 3 : 3x2x1 = 6

        Regle de calcul de factorielle : http://villemin.gerard.free.fr/Denombre/Factorie.htm

 */
