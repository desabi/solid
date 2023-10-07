package examplea;

// fuente: chatgpt
// Adhering to SRP
/**
 * The Book class is responsible for managing book information, the Library class handles the checkout process,
 * and the BookPrinter class is responsible for printing book information.
 * This adheres to the SRP because each class has a single responsibility.
 * */
public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters for title, author, isbn

    // Other book-related methods
}
