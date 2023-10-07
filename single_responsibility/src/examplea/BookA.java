package examplea;

// fuente: chatgpt
// Violating SRP (Single Responsibility Principle)
/**
 * In this example, the Book class has two responsibilities: managing book information and handling the checkout process.
 * This violates the SRP because the class has more than one reason to change. If you need to modify the checkout logic,
 * it might affect the book information management or vice versa.
 * */
public class BookA {

    private String title;
    private String author;
    private String isbn;

    public BookA(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void checkout() {
        // Checkout logic here
    }
    // Create a class Library with the method checkout(Book book)

    public void printInfo() {
        // Printing book info logic here
    }
    // Create a class Printer with the method printInfo(Book book)
}
