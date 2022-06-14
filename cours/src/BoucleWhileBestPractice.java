import java.util.Scanner;

public class BoucleWhileBestPractice {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var codePIN = "";

        System.out.println("Veuillez definir un code PIN a 4 caracteres");

        while (true){
            System.out.print("Code PIN: ");
            codePIN = input.nextLine();

            if (codePIN.length() != 4){
                System.out.println("Error: le code PIN doit etre compose de 4 caracteres");
            }else {
                System.out.println("Code PIN defini avec succes");
                break;
            }
        }

        System.out.println("*************************");
        System.out.println("***Telephone verouilee***");
        System.out.println("*************************");

        String codeATester="";
        while (true){
            System.out.print("Entrer votre code PIN pour deverouiller le telephone: ");
            codeATester = input.nextLine();

            if (codeATester.equals(codePIN)){
                System.out.println("Felicitaions! Appareil deverouillee");
                break;
            }else {
                System.out.println("Code PIN errone, veuillez recommencer");
            }
        }
    }
}


