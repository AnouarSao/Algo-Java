package test_poo;

public class Movie {
    private String title;
    private String author;

    public Movie(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public Movie(){
        this.title = "Lord of the rings";
        this.author = "JRR Tolkien";
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString(){
        return String.format("Title: %s => Author: %s", this.title, this.author);
    }

    public String displayBook(){
        return String.format("Title: %s => Author: %s", this.title, this.author);
    }
}
