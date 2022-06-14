import java.util.Arrays;
import java.util.Scanner;

public class exo16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Combien de nombre voulez-vous inserer: ");
        int nombreAInserer=input.nextInt();

        int [] nombre=new int[nombreAInserer];

        for(int i = 0; i < nombre.length; i++){
            System.out.printf("Nombre[%d] : ",i);
            nombre[i]=input.nextInt();
        }
        System.out.println("Tableau contient les valeurs: "+ Arrays.toString(nombre));

        System.out.print("Entrer le nombre a rechercher: ");
        int nombreARechercher = input.nextInt();
        int compteur = 0;

        for (int i = 0; i < nombre.length; i++) {

            if(nombre[i] == nombreARechercher){
                compteur ++;
            }
        }
        if(compteur > 0){
            System.out.printf("%d existe et se retrouve %d fois dans le tableau\n", nombreARechercher, compteur);
        }else{
            System.out.printf("%d n'existe pas dans le tableau", nombreARechercher);
        }
    }
}
