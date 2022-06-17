package tp_poo.tp1_personne;

public class Personne {
    /*
    TP 1 POO:

    Ecrire une classe Personne qui est décrit par les données suivantes:
    firstName
    lastName
    pays
    married(booléen)
    nombreEnfants

    On doit avoir une méthode qui retourne un string nomComplet

    Dans le main, vous devez à partir du clavier demander à l'utilisateur de fournir toutes ces données et enfin les afficher dans main.

     */


    private String firstName;
    private String lastName;
    private String country;
    private boolean married;
    private int numberOfChildren;

    public Personne(String firstName, String lastName, String country,boolean married, int numberOfChildren ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.married = married;
        this.numberOfChildren = numberOfChildren;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public boolean isMarried() {
        return married;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public String fullName(){
        return firstName +" "+ lastName;
        // return String.format("%s %s", firstName, lastName);
    }

    public String fullDescription(){
        return  String.format("You are %s %s, from %s, %s with %s kids",
                firstName,
                lastName,
                country,
                married ? "married" : "not married",
                numberOfChildren);

    }

    /*
    String firstName;
    String lastName;
    String country;
    boolean married;
    int numberOfChildren;

    String fullName() {
        return firstName+" "+lastName;
    }
    public String fullDescription(){
        return  String.format("You are %s %s, from %s, %s with %s kids",
                firstName,
                lastName,
                country,
                married ? "married" : "not married",
                numberOfChildren);

    }
     */
}
