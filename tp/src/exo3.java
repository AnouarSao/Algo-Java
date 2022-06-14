import java.util.Scanner;
public class exo3 {
    public static void main(String[] args) {
        String nom, prenom;
        byte age;

        Scanner t = new Scanner(System. in );

        System.out.print("Entrer votre nom: ");
        nom = t.nextLine();

        System.out.print("Enter votre prenom: ");
        prenom = t.nextLine();

        System.out.print("Entrer votre age: ");
        age = t.nextByte();

        System.out.println("Vous vous appelez " + nom +" "+ prenom + " et vous avez " + age + " ans");

    }
}
/*
E3.
        Ecrire un programme Java qui demande à l'utilisateur de saisir son nom, prenom et age, et qui ensuite va afficher le message : "Vous vous appelez <prenom> <nom>, et vous avez <age> ans"


 */