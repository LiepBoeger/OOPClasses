package a_classes_objetos.BookExercise;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public static void main(String[] args) {
        Main library = new Main();

        int numBooks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of books to add:"));

        for (int i = 0; i < numBooks; i++) {
            String title = JOptionPane.showInputDialog("Enter book title:");
            double price = Double.parseDouble(JOptionPane.showInputDialog("Enter book price:"));

            int numAuthors = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of authors for this book:"));
            ArrayList<Author> authors = new ArrayList<>();

            for (int j = 0; j < numAuthors; j++) {
                String firstName = JOptionPane.showInputDialog("Enter author's first name:");
                String lastName = JOptionPane.showInputDialog("Enter author's last name:");
                Gender gender = Gender.valueOf(JOptionPane.showInputDialog("Enter author's gender (MASCULINE/FEMININE):").toUpperCase());
                int age = Integer.parseInt(JOptionPane.showInputDialog("Enter author's age:"));

                authors.add(new Author(firstName, lastName, gender, age));
            }

            library.addBook(new Book(title, price, authors));
        }

        StringBuilder bookInfo = new StringBuilder();
        for (Book book : library.getAllBooks()) {
            bookInfo.append("Title: ").append(book.getTitle()).append(", Price: R$").append(book.getPrice()).append("\n");
        }

        JOptionPane.showMessageDialog(null, "All books:\n" + bookInfo.toString());
    }
}
