import java.util.ArrayList;
import java.util.Scanner;

public class exo22 {
    public static void main(String[] args) {

        ArrayList<String> adresseMail = new ArrayList<>();

        adresseMail.add("christian.lisangola@gmail.com");
        adresseMail.add("jean.paul@gmail.com");
        adresseMail.add("alain@gmail.com");
        adresseMail.add("lydie@yahoo.fr");
        adresseMail.add("josephine.lajoie@yahoo.com");
        adresseMail.add("luise@hotmail.fr");
        adresseMail.add("philemon.turion@gmail.com");
        adresseMail.add("jules.cesar@hotmail.fr");

        int gmail = 0;
        int yahoo = 0;
        int hotmail = 0;

        for (int i = 0; i < adresseMail.size(); i++) {
            String mail = adresseMail.get(i);
            String domaine = mail.substring(mail.indexOf('@'));
            if(domaine.equals("gmail")){

            } else if (domaine.equals("gmail")) {
                
            } else if (domaine.equals("gmail")) {
                
            }
            System.out.printf("element[%d] : %s\n",i,adresseMail.get(i));
        }
    }
}
