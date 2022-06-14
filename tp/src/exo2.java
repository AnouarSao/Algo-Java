import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        float diametre;

        Scanner t = new Scanner(System. in );

        System.out.print("Entrer le diametre: ");
        diametre = t.nextInt();

        float rayon = diametre/2;
        double surface = rayon * rayon * Math.PI;
        System.out.println("La valeur de la surface est: " + surface);

    }
}
/*E2.
Ecrire un programme Java qui demande à l'utilisateur de saisir la valeur du diamètre, et qui ensuite va effectuer le calcul de la surface.

Surface = Rayon x Rayon x PI;
Rayon = Diamètre / 2

 */
