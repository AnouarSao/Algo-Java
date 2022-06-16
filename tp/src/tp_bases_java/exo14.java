package tp_bases_java;

import java.util.Scanner;

public class exo14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Definissez une adresse mail: ");
        String mailADefinir = input.nextLine();

        System.out.print("Definissez un mot de passe: ");
        String mdpADefinir = input.nextLine();

        System.out.println("Compte cree avec succes");
        System.out.println("-----------------------");
        System.out.println("+++++++++++++++++++++++");
        System.out.println("-----------------------");

        int tentative = 0;

        while(true){
            tentative++;

            System.out.print("Fournissez votre adresse mail: ");
            String mailAFournir= input.nextLine();

            System.out.print("Fournissez votre mot de passe: ");
            String mdpAFournir = input.nextLine();

            if(mailAFournir.equals(mailADefinir) && mdpAFournir.equals(mdpADefinir)) {
                System.out.println("Bienvenu dans votre espace client");
                System.out.printf("Nombre de tentative: %d\n", tentative);
                System.out.println("-----------------------");
                break;
            } else if (tentative == 5) {
                System.out.printf("Vous avez saisi des mauvais identifiants %d fois, votre compte est bloque\n", tentative);
                System.out.println("-------------------------------------------------------------------------");
                break;
            } else {
                System.out.println("Identifiants incorrect");
                System.out.printf("Nombre de tentatives restantes: %d\n", (5 -tentative));
                System.out.println("---------------------------------");
            }
        }
    }
}