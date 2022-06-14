import java.util.Scanner;

public class exo19 {
    public static void main(String[] args) {
        /*
        Ecrire un programme java qui demande à l'utilisateur de remplir une matrice carré 4 x 4 et qui ensuite va calculer la somme des elements de la diagonale
         */
        Scanner input = new Scanner(System.in);

        int[][] matriceCarre = new int[4][4];
        int sommeDiagonale = 0;

        for (int i = 0; i < matriceCarre.length; i++) {
            System.out.printf("Ligne  %d\n", i);
            for (int j = 0; j < matriceCarre[i].length; j++) {
                System.out.printf("element[%d][%d] : ",i,j);
                matriceCarre[i][j] = input.nextInt();
                if (i == j){
                    sommeDiagonale += matriceCarre[i][j];
                }
            }
            System.out.println("--------------");
        }
        System.out.println("Affichage de la matrice");
        for(int i=0; i < matriceCarre.length; i++){
            for(int j=0; j< matriceCarre[i].length; j++){
                System.out.print(matriceCarre[i][j] +" ");
            }
            System.out.println();
        }
        System.out.printf("La somme des elements de la diagonale1 est %d\n", sommeDiagonale);
    }
}
