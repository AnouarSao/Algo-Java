import java.util.Scanner;
import java.util.Arrays;

public class exo15 {
    public static void main(String[] args) {
        /*
        Ecrire un programme Java qui permet à l'utilisateur de déclarer 3 array d'entiers.
        Ces tableaux ne doivent pas forcément avoir la même taille
        Le programme doit ensuite fournir afficher les 3 tableaux en format [element1, element2,...,elementN]
        et la somme de tous les éléments multiples 3 dans les 3 tableaux.
        Ex :
        T1 : [ 2, 6, 8, 15,39,11 ]
        T2 : [ 21, 33, 12, 19,0 ]
        T3 : [ 17, 18, 46 ]

        S = 6+15+39+21+33+12+18 = 144
        */
        Scanner input = new Scanner(System.in);

        System.out.print("Entrer le nombre de tableau: ");
        int nombreTableau = input.nextInt();

        int sommeMutiplesTrois = 0;

        for (int i = 1; i <= nombreTableau ; i++) {
            System.out.printf("Combien de nombre voulez-vous inserer pour le tableau %d: ",i);
            int nombreAInserer=input.nextInt();

            int [] nombre=new int[nombreAInserer];

            for(int j = 0; j < nombre.length; j++){
                System.out.printf("Nombre[%d] : ",j);
                nombre[j]=input.nextInt();

                if(nombre[j] % 3 == 0){
                    sommeMutiplesTrois = sommeMutiplesTrois + nombre[j];
                }
            }
            System.out.println("Tableau " +i+ " contient les valeurs "+ Arrays.toString(nombre));
        }
        System.out.printf("La somme des mutilples de 3 est S = %d",sommeMutiplesTrois);
    }
}
