public class Affichage {
    public static void main(String[] args) {
        String nom = "OURO-SAO";
        String prenom = "Anouar";
        char genre = 'M';
        byte age = 25;
        float poids = 63.8F;
        boolean estMarie = false;

        System.out.println("Vous vous appelez "+nom+", vous avez "+age+" ans. Votre poids est "+poids+ " kg");
        System.out.printf("Vous vous appelez %s %s, vous avez %d ans. Votre poids est %.2f kg\n", nom,prenom, age, poids);
        System.out.printf("Nom: %s\nPrenom: %s\nAge: %d\n\n", nom, prenom, age);

        //Avec operateur ternaire
        System.out.printf("Vous vous appelez %s %s, vous avez %d ans et vous %s\n", nom, prenom, age, estMarie?"etes marie":"n'etes pas marie");

        //Sans operateur ternaire
        String etatMaritalAAfficher=estMarie?"etes marie":"n'etes pas marie";
        System.out.printf("Vous vous appelez %s %s, vous avez %d ans et vous  %s\n", nom, prenom, age, etatMaritalAAfficher);

    }
}
