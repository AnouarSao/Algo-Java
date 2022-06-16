package cours_poo;

public class Rectangle2 {
    //Quand on ne fournit pas un constructeur, le compilateur java fournit un compilateur special appelé
    //"le constructeur par defaut par defaut"
    // ce constructeur initialise tous les champs
    private double longueur;
    private double largeur;

    //Accesseurs ou Getter : Ce sont des méthodes qui nous donnent un accès en lecture
    // aux membres ou attributs privés
    public double getLongueur(){
        return longueur;
    }

    public double getLargeur(){
        return largeur;
    }

    //Manipulateurs ou Setters : Ce sont des méthodes qui nous donnent la possibilité
    // de modifier des attributs privés

    // this dans cette situation nous pemet d'eviter le shadowing(masquage)
    // Le shadowing est le fait qu'un parametre de fonction empeche
    // la fonction ou methode de voir l'attribut ayant le meme nom
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
}
