package test_poo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Movie film = new Book("Lord of the rings", "JRR Tolkien" );
        Movie film = new Movie();

        System.out.println("Title: " + film.getTitle());
        System.out.println("Author: " + film.getAuthor());
        System.out.println("---------------------------------------------------");

        film.setTitle("Game Of Thrones");
        film.setAuthor("GRR Martin");
        System.out.println(film);
        System.out.println("---------------------------------------------------");

        film.setTitle("Harry Potter");
        film.setAuthor("JK Rowlings");
        System.out.println(film.displayBook());
        System.out.println("---------------------------------------------------");

        String[] tab = {""};
            System.out.println(Arrays.toString(tab));
    }
}
