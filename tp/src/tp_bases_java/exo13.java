package tp_bases_java;

import java.util.Scanner;

public class exo13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Definissez une adresse mail: ");
        String mailADefinir = input.nextLine();

        System.out.print("Definissez un mot de passe: ");
        String mdpADefinir = input.nextLine();

        System.out.println("Compte cree avec succes");
        System.out.println("++++++++++++++++++++++++++++++");

        while(true){
            System.out.print("Fournissez votre adresse mail: ");
            String mailAFournir= input.nextLine();

            System.out.print("Fournissez votre mot de passe: ");
            String mdpAFournir = input.nextLine();

            if(mailAFournir.equals(mailADefinir) && mdpAFournir.equals(mdpADefinir)){
                System.out.println("Bienvenu dans votre espace client" );
                break;
            } else if (!mailAFournir.equals(mailADefinir) && mdpAFournir.equals(mdpADefinir)) {
                System.out.println("adresse mail incorrect");
            } else if (mailAFournir.equals(mailADefinir) && !mdpAFournir.equals(mdpADefinir)) {
                System.out.println("mot de passe incorrect");
            } else {
                System.out.println("Identifiants incorrect");
            }
        }
    }
}
