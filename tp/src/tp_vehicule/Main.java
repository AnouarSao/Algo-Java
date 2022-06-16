package tp_vehicule;

public class Main {
    public static void main(String[] args) {

        Voiture voiture1 = new Voiture(2000, 2000 );
        Camion camion1 = new Camion( 2001, 3000);
        Voiture voiture2 = new Voiture(2002, 4000 );
        Camion camion2 = new Camion( 2003, 5000);
        Voiture voiture3 = new Voiture(2004, 6000 );
        Camion camion3 = new Camion( 2005, 70000);

        System.out.println("-------------------------------------------------------------");
        voiture1.demarrer();
        voiture1.accelerer();
        System.out.println(voiture1);

        System.out.println("-------------------------------------------------------------");
        camion1.demarrer();
        camion1.accelerer();
        System.out.println(camion1);

        System.out.println("-------------------------------------------------------------");
        voiture2.demarrer();
        voiture2.accelerer();
        System.out.println(voiture2);

        System.out.println("-------------------------------------------------------------");
        camion2.demarrer();
        camion2.accelerer();
        System.out.println(camion2);

        System.out.println("-------------------------------------------------------------");
        voiture3.demarrer();
        voiture3.accelerer();
        System.out.println(voiture3);

        System.out.println("-------------------------------------------------------------");
        camion3.demarrer();
        camion3.accelerer();
        System.out.println(camion3);
        System.out.println("-------------------------------------------------------------");

    }
}
