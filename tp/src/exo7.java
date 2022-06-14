import java.util.Scanner;

public class exo7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrer un nombre: ");
        float nombre = input.nextFloat();

        boolean isPositive = nombre > 0 ;
        boolean isEven = nombre % 2 == 0;

        String estPositif = isPositive?"positif":"negatif";
        String estPair= isEven?"pair":"impair";

        if(nombre == 0) {
            System.out.println("Le nombre est zero (et il est pair)");
        }else {
            System.out.printf("Le nombre %f est %s et %s", nombre, estPositif, estPair);
        }

        /*
        if(nombre == 0){
            System.out.println("Le nombre est zero (et il est pair)");
        } else if(isPositive && isEven){
            System.out.println("Le nombre est positif et pair");
        } else if (isPositive && !isEven) {
            System.out.println("Le nombre est positif et impair");
        } else if (!isPositive && isEven) {
            System.out.println("Le nombre est negatif et pair");
        } else if (!isPositive && !isEven) {
            System.out.println("Le nombre est negatif et imppair");
        }else{
            System.out.println("Vous avez entrer un nombre non autorise");
        }
        */
    }
}

/*Exercice 7
Ecrivez un programme Java qui lit un nombre et indique s'il est positif, négatif ou s'il vaut zéro et s'il est pair ou impair.
Exemple d'exécution:
Entrez un nombre entier: 5
Le nombre est positif et impair
Entrez un nombre entier: -4
Le nombre est négatif et pair
Entrez un nombre entier: 0
Le nombre est zéro (et il est pair)

 */
