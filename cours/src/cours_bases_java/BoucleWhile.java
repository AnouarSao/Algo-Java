package cours_bases_java;

import java.util.Scanner;

public class BoucleWhile {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Veuillez definir un code PIN: ");
        var codePIN = input.nextInt();

        System.out.println("*************************");
        System.out.println("***Telephone verouilee***");
        System.out.println("*************************");

        int codeATester=0;
        while (codeATester !=codePIN){
            System.out.print("Entrer votre code PIN pour deverouiller le telephone: ");
            codeATester = input.nextInt();

        }
    }
}
