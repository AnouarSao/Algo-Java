package tp_poo.tp1_personne;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Personne personne = new Personne("toto", "tata", "usa", true, 6);
        System.out.println(personne.fullDescription());

        System.out.print("Enter first name: ");
        personne.setFirstName(input.nextLine());

        System.out.print("Enter last name: ");
        personne.setLastName(input.nextLine());

        System.out.print("Enter country: ");
        personne.setCountry(input.nextLine());

        System.out.print("Are you married (true or false): ");
        personne.setMarried(input.nextBoolean());
        /*
        String marry = input.nextLine();
        if(marry.equals("yes")){
            personne.setMarried(true);
        }else {
            personne.setMarried(false);
        }
        */

        System.out.print("Enter number of children: ");
        personne.setNumberOfChildren(input.nextInt());

        System.out.println("Full Name: " + personne.fullName());
        System.out.println("Full Desccription: " + personne.fullDescription());

        //System.out.println("Vous etes de: " + personne.getCountry());
        //System.out.println("Vous etes marie: "+ personne.married);
        //System.out.println("Vous "+(personne.isMarried()?"etes marie":"n'etes pas marie"));
        //System.out.println("Vous avez " + personne.getNumberOfChildren() + " enfants");

    }
}
 /*
    public class Main {
        public static void main(String[] args) {

            Personne personne=new Personne();
            Scanner input = new Scanner(System.in);

            System.out.println("Veuillez completer le formulaire suivant : ");
            System.out.print("Prenom : ");
            personne.firstName=input.nextLine();

            System.out.print("Nom : ");
            personne.lastName=input.nextLine();

            System.out.print("Pays : ");
            personne.country= input.nextLine();

            System.out.print("Are you married (true or false): ");
            personne.married = input.nextBoolean();

            System.out.print("Nombre d'enfant(s) : ");
            personne.nombreEnfants= input.nextByte();

             System.out.print("Enter number of children: ");
            personne.setNumberOfChildren(input.nextInt());

            System.out.println("Full Name: " + personne.fullName());
            System.out.println("Full Desccription: " + personne.fullDescription());

        }
    }

     */