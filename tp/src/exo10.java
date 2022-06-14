import java.util.Scanner;

public class exo10 {
    public static void main(String[] args) {
        /*
        Exo 10.
        Écrivez un programme Tables.java affichant les tables de multiplication de 2 à 10.
        Votre programme devra produire la sortie suivante à l'écran :

        Tables de multiplication

        Table de 2 :
        1 * 2 = 2
...
        10 * 2 = 20
 ...
        Table de 5 :
        1 * 5 = 5
        2 * 5 = 10
... ...
        Table de 10 :
        1 * 10 = 10 …

         */
        Scanner input = new Scanner(System.in);

        System.out.print("Entrer tableDebut: ");
        int tableDebut = input.nextInt();

        System.out.print("Entrer tableFin: ");
        int tableFin = input.nextInt();

        System.out.println("---------------------------------------");

        System.out.print("nombreDebut: ");
        int nombreDebut=input.nextInt();

        System.out.print("nombreFin: ");
        int  nombreFin=input.nextInt();

        System.out.println("---------------------------------------");
        System.out.printf("Table de multiplication de %d jusqu'a %d\n", tableDebut, tableFin);
        System.out.println("---------------------------------------");

        for(int i=tableDebut; i<=tableFin; i++){
            System.out.printf("Table de multiplication de %d\n" , i);

            for(int j=nombreDebut; j<=nombreFin; j++){
                System.out.printf("%d x %d = %d\n",j , i, (j*i));
            }
            System.out.println("---------------------------------------");
        }

    }
}
