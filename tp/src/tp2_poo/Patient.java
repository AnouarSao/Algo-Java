package tp2_poo;

public class Patient {

    private String nom;
    private  String prenom;
    private int age;
    private float poids;
    private float taille;

    public  Patient(String nom, String prenom, int age, float poids, float taille){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.poids = poids;
        this.taille = taille;
    }

    public  Patient(){
        nom = " ";
        prenom = " ";
        age = 45;
        poids = 67.6f;
        taille = 1.6f;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18 || age >65){
            System.out.println("peut pas interpreter");
            System.exit(1);
        } else {
            this.age = age;
        }

    }

    public float getPoids(){
        return  poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public  float getTaille(){
        return taille;
    }

    public void setTaille(float taille) {
        this.taille = taille;
    }

    double IndiceMasseCorporelle(){
        double imc = poids / Math.pow(taille,2);
        return  imc;
    }

    /*
    public String fichePatient(){
        return  String.format("Nom complet: %s %s, Age: %d, Poids: %.2f, Taille: %.2f ", nom, prenom, age, poids,taille );
    }

     */

    public String toString(){
        return  String.format("Nom complet: %s %s, Age: %d, Poids: %.2f, Taille: %.2f ", this.nom, this.prenom, this.age, this.poids,this.taille );
    }
}
