import java.util.*;
public class Main{

    /**
     * Main Function
     * This displays information to the user
     * @param args
     */
    public static void main(String args[]){
        System.out.println("Hi! Welcome to our Library Book Management System!");
        System.out.println("What should we call you?");
        String name_user;
        Integer option;
        Scanner sc = new Scanner(System.in);
        // Accept the name of the user as input
        name_user = sc.nextLine();

        // Display options to the user and take input
        System.out.println("If you want to add a book, press 1");
        System.out.println("If you want to see all books, press 2");
        System.out.println("If you want to get a book issued, press 3");
        System.out.println("If you want to return a book, press 4");
        option = sc.nextInt();

        // Perform operation based on the input
        switch(option){
            case 1: add_book();
            case 2: list_books();
            case 3: issue_book();
            case 4: return_book();
        }

    }

    /**
     * Adds the book into the library
     */
    private static void add_book() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    private static void list_books() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void issue_book() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void return_book() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}