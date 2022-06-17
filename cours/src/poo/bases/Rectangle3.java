package poo.bases;

public class Rectangle3 {
    private double longueur;
    private double largeur;

    // Constructeur (Rectangle3), méthode speciale, public, le meme nom que la classe
    // appelee une seule fois au moment de la creation de l'objet
    // Surcharge: la possibilite d'avoir au sein d'une classe plusieurs methodes
    // avec le meme nom, mais differents signatures
    public Rectangle3(double longueur, double largeur){
        this.longueur = longueur;
        this.largeur =largeur;
    }

    // autre maniere de definir un constructeur
    // constructeur par defaut
    public Rectangle3(){
        longueur = 10;
        largeur = 5;
    }


    public double getLongueur(){
        return longueur;
    }

    public double getLargeur(){
        return largeur;
    }


    public void setLongueur(double longueur){
        this.longueur =longueur;
    }

    public void setLargeur(double largeur){
        this.largeur =largeur;
    }


    double calculDeLaSurface(){
        return longueur*largeur;
    }

    double calculDuPerimetre(){
        return 2*(longueur+largeur);
    }

    public String toString(){
        return String.format("[ Longueur : %f\nLargeur : %f\nSurface : %f\nPerimètre %f" +
                        " ]",
                this.longueur,this.largeur,this.calculDeLaSurface(),this.calculDuPerimetre());
    }
}

