package practice;
/**
 * Book class represents details of a book.
 * It demonstrates encapsulation, constructors,
 * and basic object-oriented concepts.
 */

public class Books {

    // Private attributes
    private String title;
    private String author;
    private double price;

    // Default Constructor
    public Books() {
        this.title = "Not Available";
        this.author = "Not Available";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to update book details
    public void setDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
}