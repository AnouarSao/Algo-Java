import java.util.Scanner;

public class exo8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrer un a: ");
        float a= input.nextFloat();

        System.out.print("Entrer un b: ");
        float b= input.nextFloat();

        System.out.print("Entrer un c: ");
        float c= input.nextFloat();

        double discriminant = (Math.pow(b,2) - 4*a*c);

        if(discriminant < 0)
        {
            System.out.println(" L'equation n'a pas de solution reelle");
        }
        if(discriminant == 0)
        {
            System.out.println("L'equation a une solution unique");
            float x0 = -b / (2*a);
            System.out.printf("La solution est: x0 = %.2f", x0);
        }
        if(discriminant > 0)
        {
            System.out.println("L'equation a deux solutions");
            double x1 = (-b - Math.sqrt(discriminant))/ (2*a);
            //x1 = Math.round(x1);
            double x2 = (-b + Math.sqrt(discriminant))/ (2*a);
            //x2 = Math.round(x2);
            System.out.printf("Les solutions sont: x1 = %.2f et x2= %.2f", x1, x2);

        }
    }
}

/*Exercice 8
Ecrivez un programme Java qui permet de résoudre une équation du 2nd degré de la forme ax2+bx+c = 0.
L'utilisateur devra fournir a,b,c à partir du clavier, ensuite le programme lui donnera la solution
Principe du fonctionnement d'une équation du 2nd degré:

https://www.maths-et-tiques.fr/telech/Secondegre2ESL.pdf

 */
