package tp_bases_java;

import java.util.ArrayList;
import java.util.Scanner;

public class exo21 {

    /*Ecrire un programme Java demande à l'utilisateur de saisir  liste de langages de programmations à partir du clavier.

    Une fois le tableau rempli, l'utilisateur sera appelé à saisir les noms des langages qu'il souhaite retirer de liste.

    Le programme devra ensuite retirer ces langages et afficher l'état du tableau avant et après la suppression

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Saisissez les langages de programmation: ");
        ArrayList<String> langage = new ArrayList<>();

        while(true){
          String langageAInserer = input.nextLine();
          //  if(langageAInserer.isBlank() && !langage.isEmpty())
          if(langageAInserer.equals("quit")){
              break;
          }
          langage.add(langageAInserer);
        }
        System.out.println("Tableau avant suppression");
        System.out.println(langage);

        while (true){
            String langageARetirer = input.nextLine();
            if (langageARetirer.equals("quit")) {
                break;
            }
            langage.remove(langageARetirer);
        }
        System.out.println("Tableau apres suppression");
        System.out.println(langage);
    }
}
