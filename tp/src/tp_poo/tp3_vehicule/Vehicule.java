package tp_poo.tp3_vehicule;

public abstract class Vehicule {
    private int matricule;
    private int anneeModele;
    private  float prix;

    private static  int compteur = 0;

    public Vehicule(int anneeModele, float prix) {
        this.anneeModele = anneeModele;
        this.prix = prix;
        this.compteur++;
        this.matricule = compteur;
    }

    public int getMatricule() {
        return matricule;
    }

    public int getAnnee() {
        return anneeModele;
    }

    public float getPrix() {
        return prix;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void setAnnee(int annee) {
        this.anneeModele = annee;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public abstract void demarrer();

    public abstract  void accelerer();

    @Override
    public String toString() {
        return "Vehicule{" +
                "matricule=" + matricule +
                ", anneeModele=" + anneeModele +
                ", prix=" + prix +
                '}';
    }
}
