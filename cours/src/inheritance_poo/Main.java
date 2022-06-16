package inheritance_poo;

// Surcharge ou Overloading:  avoir plusieurs méthodes de meme nom mais avec differentes signatures

// Redefinition ou Overriding: le fait de fournir une implementation d'une methode deja existance d'une classe parent

public class Main {
    public static void main(String[] args) {
        Guerrier ano = new Guerrier("Anouar", 400, "AK 47");
        Guerrier val = new Guerrier("Valentin", 500, "M16");

        Voleur lud = new Voleur("Ludovic", 2999, "Pistolet");

        Magicien mar = new Magicien("Marion", 3000, "baguette marionnetique");

        Sorcier tom = new Sorcier("Thomas", 9655, "baguette athomique", "baton athomique");

        ano.rencontrer();
        val.rencontrer();
        lud.rencontrer(); lud.voler();
        mar.rencontrer();
        tom.rencontrer();

        //Personnage personnage = new Personnage("Moi", 200 ); on ne peut pas implementer une classe abstraite
        //personnage.rencontrer();

    }
}
