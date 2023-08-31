package a_classes_objetos.BookExercise;

import java.util.ArrayList;

public class Book {
    private String title;
    private double price;
    private ArrayList<Author> authors = new ArrayList<>();

    public Book(String title, double price, ArrayList<Author> authors) {
        this.title = title.toLowerCase();
        this.price = price;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }
}
