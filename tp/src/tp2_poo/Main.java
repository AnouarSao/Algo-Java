package tp2_poo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Patient patient = new Patient();

        System.out.print("Nom: ");
        patient.setNom(input.nextLine());

        System.out.print("Prenom: ");
        patient.setPrenom(input.nextLine());

        System.out.print("Age: ");
        patient.setAge(input.nextInt());

        System.out.print("Poids: ");
        patient.setPoids(input.nextFloat());

        System.out.print("Taille: ");
        patient.setTaille(input.nextFloat());

        System.out.println(patient);
        System.out.println("IMC = " + patient.IndiceMasseCorporelle());
    }
}
