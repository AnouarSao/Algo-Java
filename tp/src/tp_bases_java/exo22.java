package tp_bases_java;

import java.util.ArrayList;

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

        int totalGmail = 0;
        int totalYahoo = 0;
        int totalHotmail = 0;

        for (int i = 0; i < adresseMail.size(); i++) {
            String mail = adresseMail.get(i);

            if(mail.contains("gmail")){
                totalGmail++;
            } else if (mail.contains("yahoo")) {
                totalYahoo++;
            } else if (mail.contains("hotmail")) {
                totalHotmail++;
            }
        }

        System.out.printf("totalGmail: %d\n", totalGmail);
        System.out.printf("totalYahoo: %d\n", totalYahoo);
        System.out.printf("totalHotmail: %d\n", totalHotmail);

        System.out.println(adresseMail.size());

        float pourcentageGmail = (totalGmail/ (float)adresseMail.size()) * 100;
        System.out.printf("Le pourcentage de Gmail est: %.2f\n", pourcentageGmail);

        float pourcentageYahoo = (totalYahoo/ (float)adresseMail.size()) * 100;
        System.out.printf("Le pourcentage de Yahoo est: %.2f\n", pourcentageYahoo);

        float pourcentageHotmail = (totalHotmail/ (float)adresseMail.size()) * 100;
        System.out.printf("Le pourcentage de Hotmail est: %.2f\n", pourcentageHotmail);
    }
}
