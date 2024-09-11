/**
 * The {@code BookUtils} class contains the utility functions for the library.
 * It contains functions to add, update, find, issue and return books.
 */
package com.library.books;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookUtils {

    /**
     * Adds a book to the library
     * @param filePath the filepath of the library file
     * @param book The book object to add to the library
     */
    public static void appendBook(String filePath, Book book) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write(book.toString());
                writer.newLine();
        } catch (IOException e) {
            System.err.println("Error "+e);
        }
    }

    
    /**
     * Lists all the books in the library
     * @param filePath the filepath of the library file
     * @return books the list of books in the library
     */
    public static List<Book> getBooks(String filePath) {
        List<Book> books = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] details = line.split(",");
                if (details.length == 4) {
                    Book book = new Book(details[0], details[1], details[2], details[3]);
                    books.add(book);
                }
            }
        } catch (IOException e) {
            System.err.println("Error "+e);
        }

        return books;
    }

    
    /**
     * Finds a book in the library by name
     * @param filePath the filepath of the library file
     * @param name name of the book to be found
     * @return
     */
    public static Book findBook(String filePath, String name) {
        List<Book> books = getBooks(filePath);
        for (Book book : books) {
            if (book.getName().equals(name)) {
                System.out.println("Name found: " + book);
                return book;
            }
        }
        System.out.println("Name not found.");
        return null;
    }

    /**
     * Updates the issued status of the book
     * @param filePath the filepath of the library file
     * @param name name of the book to be updated
     * @param status "Yes" if issuing the book, "No" if returning the book
     */
    public static void updateBookStatus(String filePath, String name, String status) {
        List<Book> books = getBooks(filePath);

        for (Book book : books) {
            if (book.getName().equals(name)) {
                System.out.println("Found book: " + book);
                book.setIssued(status);
                
                 // Update the issued status
                break;
            }
        }

         // Rewrite the updated list to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Book book : books) {
                writer.write(book.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error "+e);
        }
    }
}
