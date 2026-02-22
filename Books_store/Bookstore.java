package practice;
/**
 * Bookstore class contains the main method
 * to test Book objects.
 */

public class Bookstore {

    public static void main(String[] args) {

        // Object using default constructor
        Books book1 = new Books();
        System.out.println("=== Book Details (Default Constructor) ===");
        book1.displayDetails();

        // Object using parameterized constructor
        Books book2 = new Books(
                "The Java Handbook",
                "Patrick Naughton",
                500.0
        );

        System.out.println("\n=== Book Details (Parameterized Constructor) ===");
        book2.displayDetails();

        // Updating first book details
        book1.setDetails(
                "Effective Java",
                "Joshua Bloch",
                800.0
        );

        System.out.println("\n=== Updated Book Details ===");
        book1.displayDetails();
    }
}