import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
        byte age ;

        Scanner t = new Scanner(System. in );

        System.out.print("Entrer votre age: ");
        age = t.nextByte();

        if( age >= 7 && age <=9){
            System.out.println("Vous etes de la categorie Poussin");
        } else if (age >= 10 && age <=11) {
            System.out.println("Vous etes de la categorie Pupille");
        }else if (age >= 12 && age <=13) {
            System.out.println("Vous etes de la categorie Benjamin");
        }else if (age >= 14 && age <=15) {
            System.out.println("Vous etes de la categorie Minime");
        }else if (age >= 16 && age <=17) {
            System.out.println("Vous etes de la categorie Cadet");
        }else {
            System.out.println("Vous etes hors categorie");
        }
    }
}
/*
E1.
        Ecrire un algorithme qui demande l'âge d'un enfant. Ensuite, il l'informe de sa catégorie :

        « Poussin » de 7 à 9 ans

        « Pupille » de 10 à 11 ans

        « Benjamin » de 12 à 13 ans

        « Minime » de 14 à 15 ans

        « Cadet » 16 à 17 ans

 */
