package com.library.books;
import java.util.ArrayList;
import java.util.List;
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
            case 1: add_book(); break;
            case 2: list_books(); break;
            //case 3: issue_book(); break;
            //case 4: return_book(); break;
            default: System.out.println("invalid input");
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
        Book Book1 = new Book(book_name, author_name, volume, issued);
        Book1.add_book();

    }

    /**
     * Lists all books in the library.
     * This method is not yet implemented.
     *
     * @throws UnsupportedOperationException if the method is called
     */
    public static void list_books() {
        Book Book2 = new Book("ssa", "fsa", "1st", "no");
        List<String> headings = new ArrayList<String>();
        headings.add("Name");
        headings.add("Author");
        headings.add("Volume");
        headings.add("Issued");

        for(String[] book : Book2.get_all_books()){
            System.out.println(book);
        }
                
        //return Book2.get_all_books();
    }
            
    // }

    // /**
    //  * Issues a book from the library.
    //  * This method is not yet implemented.
    //  *
    //  * @throws UnsupportedOperationException if the method is called
    //  */
    // public static void issue_book() {
    //     throw new UnsupportedOperationException("Not supported yet.");
    // }

    // /**
    //  * Returns a book to the library.
    //  * This method is not yet implemented.
    //  *
    //  * @throws UnsupportedOperationException if the method is called
    //  */
    // public static void return_book() {
    //     throw new UnsupportedOperationException("Not supported yet.");
    // }
}
