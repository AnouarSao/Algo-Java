import java.util.Scanner;

public class exo17 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Saisissez un texte: ");
        String texte = input.nextLine();

        String texteRenverse = "";

        for(int i = texte.length() - 1; i >= 0; i--)
        {
            texteRenverse = texteRenverse + texte.charAt(i);
        }

        System.out.printf("Texte renverse: %s", texteRenverse);
    }


    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Saisissez un texte: ");
        String texte = input.nextLine();

        String texteRenverse = texte.rever
        System.out.printf("Texte reverse %s", texteRenverse);

    }

     */

    /*
    public static void main(String[] args) {
        String str = "DelfStack";
        System.out.println(str);
        StringBuilder dest = new StringBuilder();
        for (int i = (str.length() - 1); i >= 0; i--){
            dest.append(str.charAt(i));
        }
        System.out.println(dest);
    }

     */

    /*
    public static void main(String[] args) {
        String str = "paye";
        System.out.println(str);
        StringBuilder strb = new StringBuilder(str);
        str = strb.reverse().toString();
        System.out.println(str);
    }

     */
}
