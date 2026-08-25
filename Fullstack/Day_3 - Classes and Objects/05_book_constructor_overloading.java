/**
 * 05_book_constructor_overloading.java
 * Demonstrates default vs parameterized constructors and resolving parameter shadowing with 'this'.
 */
class Book {
    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        this.title = "Untitled Book";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized Constructor (2 args)
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 299.99; // Default price
    }

    // Parameterized Constructor (3 args)
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: \"" + title + "\" | Author: " + author + " | Price: ₹" + price);
    }
}

class _05_book_constructor_overloading {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Effective Java", "Joshua Bloch");
        Book b3 = new Book("Clean Code", "Robert C. Martin", 550.00);

        System.out.println("--- Book Catalog ---");
        b1.display();
        b2.display();
        b3.display();
    }
}
