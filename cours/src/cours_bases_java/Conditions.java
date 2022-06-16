package cours_bases_java;

public class Conditions {
    public static void main(String[] args) {
        // Declaration de la variable age
        byte age = 19;

        // Test conditionnel
        // Si age >= 18
        // Afficher "Vous etes majeur, et vous pouvez donc participer a la competition"
        // Fin si
        // Sinon
        // Afficher "Vous etes mineur, et vous ne pouvez pas participer a la competition"
        // FIn sinon

        if (age >= 18){
            System.out.println("Vous etes majeur, et vous pouvez donc participer a la competition");
        }else {
            System.out.println("Vous etes mineur, et vous ne pouvez pas participer a la competition");
        }

        String pays = "Chine";
        if (pays == "France"){
            System.out.println("Bonjour");
        } else if (pays == "Allemagne") {
            System.out.println("Guten Tag");
        } else if (pays == "Espagne") {
            System.out.println("Hola");
        } else if (pays == "Chine") {
            System.out.println("Ninhau");
        }else{
            System.out.println("Le pays fourni n'est pas supporte");
        }
    }
}
