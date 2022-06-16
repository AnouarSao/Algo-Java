package tp_vehicule;

public class Camion extends Vehicule{

    public Camion(int anneeModele, float prix){
        super(anneeModele, prix);
    }

    @Override
    public void demarrer() {
        System.out.println("Demarre le camion");
    }

    @Override
    public void accelerer() {
        System.out.println("Accelere le camion ");
    }

}
