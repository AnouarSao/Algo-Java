import java.util.Scanner;

public class exo18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Saisissez un texte: ");
        String texte = input.nextLine();

        String texteRenverse = "";

        for(int i = texte.length() - 1; i >= 0; i--)
        {
            texteRenverse = texteRenverse + texte.charAt(i);
        }

        System.out.printf("Texte renverse: %s\n", texteRenverse);


        if (texte.equals(texteRenverse)) {
            System.out.printf("Le mot %s est un palindrome", texte);

        }else {
            System.out.printf("Le mot %s n'est pas un palindrome", texte);
        }
    }
}
