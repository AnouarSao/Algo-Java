import java.util.Scanner;

public class exo24 {
    /*

    Ecrire une méthode Java qui prend en paramètre 2 string et qui ensuite retourne un booléen(true/false)
    selon que le 2ème string est le préfixe du premier ou pas.
    Ex :

    isPrefix("banner", "bang")
    > false

    isPrefix("hugging", "hug")
    > true
     */
    static boolean isPrefix(String mot, String debutMot ){

        if(debutMot.length() > mot.length()){
            System.out.println("debut mot trop grand");
            return false;
        }
        /*
        if(debutMot.equals(mot.substring(0, debutMot.length()))){
            return  true;
        }
        return  false;

         */
        var prefix = mot.substring(0, debutMot.length());
        return (debutMot.equals(prefix));
    }


    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Entrer le mot: ");
        String mot = input.nextLine();

        System.out.print("Entrer le debut du mot: ");
        String debutMot = input.nextLine();

        System.out.println(isPrefix(mot, debutMot));
    }
}

