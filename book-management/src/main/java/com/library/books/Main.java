package com.library.books;
import java.util.Scanner;

/**
 * The {@code Main} class contains the main method which serves as the entry point for the Library Book Management System.
 * It displays options to the user and performs operations based on user input.
 */
public class Main 
{
    /**
     * A {@code Scanner} object to take input from the user.
     */
    static Scanner sc = new Scanner(System.in);

    static String filePath = "./book-management/src/data/books.txt";

    /**
     * The main method which is the entry point of the application.
     * It welcomes the user, displays options, and performs operations based on user input.
     *
     * @param args command-line arguments (not used)
     */
    public static void main( String[] args )
    {
        // Welcome the user and ask name
        System.out.println("Hi! Welcome to our Library Book Management System!");
        System.out.println("What should we call you?");
        String name_user = sc.nextLine();
        System.out.println("Hello, " + name_user);
        Integer option;

        // Display options to the user and take input
        System.out.println("If you want to add a book, press 1");
        System.out.println("If you want to see all books, press 2");
        System.out.println("If you want to get a book issued, press 3");
        System.out.println("If you want to return a book, press 4");
        option = sc.nextInt();
        sc.nextLine();
        // Perform operation based on the input
        switch(option)
        {
            case 1 -> add_book();
            case 2 -> list_books();
            case 3 -> {
                System.out.println("Enter the name of the book you want to be issued:");
                String name = sc.nextLine();
                issue_book(name);
            }
            case 4 -> {
                System.out.println("Enter the name of the book you want to return:");
                String namer = sc.nextLine();
                issue_book(namer);
            }
            default -> System.out.println("invalid input");
        }
        
    }

    /**
     * Adds a new book to the library.
     */
    public static void add_book() {

        // Ask for the book details
        System.out.println("Enter the name of the book to add:");
        String book_name = sc.nextLine();
        
        System.out.println("Enter the author of the book to add:");
        String author_name = sc.nextLine();
        System.out.println("Enter the volume number of the book to add(Eg. 1st, 2nd..):");
        String volume = sc.nextLine();
        String issued = "no";

        System.out.println("Book Name: " + book_name);
        System.out.println("Author Name: " + author_name);
        System.out.println("Volume: " + volume);
        System.out.println("Issued: " + issued);

        // Create an object of Book class and call the function
        Book book = new Book(book_name, author_name, volume, issued);
        book.add_book(filePath);

    }

    /**
     * Lists all books in the library.
     * 
     */
    public static void list_books() {
        Book Book2 = new Book("ssa", "fsa", "1st", "no");
        System.out.println(Book2.get_all_books(filePath));
    
    }
            
    

    /**
     * Issues a book from the library.
     * 
     */
    public static void issue_book(String name) {
        Book Book2 = new Book("ssa", "fsa", "1st", "no");
        Book2.issue_book(filePath, name);
    }

    /**
     * Returns a book to the library.
     * This method is not yet implemented.
     *
     * @throws UnsupportedOperationException if the method is called
     */
    public static void return_book(String name) {
        Book Book2 = new Book("ssa", "fsa", "1st", "no");
        Book2.return_book(filePath, name);
    }
}
