package tp_vehicule;

public class Voiture extends Vehicule {

    public Voiture(int anneeModele, float prix) {
        super(anneeModele, prix);
    }

    @Override
    public void demarrer() {
        System.out.println("Demarre la voiture");
    }

    @Override
    public void accelerer() {
        System.out.println("Accelere la voiture");
    }

}
