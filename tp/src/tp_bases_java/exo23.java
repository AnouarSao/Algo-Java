package tp_bases_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exo23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Set<Integer> numeroDuJour = new HashSet<Integer>();
        ArrayList<Integer> numeroDuJour = new ArrayList<>();
        numeroDuJour.add(1);
        numeroDuJour.add(2);
        numeroDuJour.add(3);
        numeroDuJour.add(4);
        numeroDuJour.add(5);
        numeroDuJour.add(6);
        numeroDuJour.add(7);

        //Set<String> nomDuJour = new HashSet<String>();
        ArrayList<String> nomDuJour = new ArrayList<>();
        nomDuJour.add("Lundi");
        nomDuJour.add("Mardi");
        nomDuJour.add("Mercredi");
        nomDuJour.add("Jeudi");
        nomDuJour.add("Vendredi");
        nomDuJour.add("Samedi");
        nomDuJour.add("Dimanche");

        System.out.println(numeroDuJour);
        System.out.println(nomDuJour);

        HashMap<Integer, String> jour = new HashMap<>();
        for (int i = 0; i < nomDuJour.size(); i++) {
            jour.put(i+1, nomDuJour.get(i));
        }

        /*
        jour.put(1, "Lundi");
        jour.put(2, "Mardi");
        jour.put(3, "Mercredi");
        jour.put(4, "Jeudi");
        jour.put(5, "Vendredi");
        jour.put(6, "Samedi");
        jour.put(7, "Dimanche");
         */
        System.out.print("Entrer un numero  du jour: ");
        int numero = input.nextInt();
        String  nom = input.nextLine();

        for ( Map.Entry<Integer,String>  entry:jour.entrySet()){
            //System.out.println(entry.getKey()+" => "+entry.getValue());
            if(numero == entry.getKey()){
                System.out.println(entry.getValue());
            }
        }
        /*
        for ( Map.Entry<Integer,String>  entry:jour.entrySet()){
            //System.out.println(entry.getKey()+" => "+entry.getValue());
            if(numero == entry.getKey()){
                System.out.println(entry.getValue());
            } else if (nom == entry.getValue()) {
                System.out.println(entry.getKey());
            }else {
                break;
            }
        }

         */

        //System.out.println(jour);
    }
}
