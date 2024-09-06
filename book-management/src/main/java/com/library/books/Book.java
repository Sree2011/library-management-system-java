package com.library.books;

import java.util.HashMap;
import java.util.List;

import org.dflib.DataFrame;
/**
 * The {@code Book} class represents a book in the library.
 * It contains details about the book such as its name, author, volume, and issued status.
 */
public class Book {
    /**
     * The name of the book.
     */
    static String name;

    /**
     * The author of the book.
     */
    static String author;

    /**
     * The volume of the book.
     */
    static String volume;

    /**
     * The issued status of the book.
     */
    static String issued;


    /**
     * 
     * Filepath of the library csv file
     */
    static String filePath = "./book-management/src/data/books.csv";

    /**
     * Constructs a new {@code Book} with the specified details.
     *
     * @param name   the name of the book
     * @param author the author of the book
     * @param volume the volume of the book
     * @param issued the issued status of the book
     */
    public Book(String name, String author, String volume, String issued) {
        this.name = name;
        this.author = author;
        this.volume = volume;
        this.issued = issued;
    }

    /**
     * Adds a new book to the library.
     * This method is not yet implemented.
     *
     * @throws UnsupportedOperationException if the method is called
     */
    public static void add_book() {
        HashMap<String,String> my_dict = new HashMap<String,String>();
        my_dict.put("name", name);
        my_dict.put("author",author);
        my_dict.put("volume",volume);
        my_dict.put("issued",issued);

        BookUtils.appendDictToCsv(filePath,my_dict);

    }

    public static DataFrame get_all_books(){
        return BookUtils.getBooks(filePath);
//     
    }
}
//     /**
//      * Finds a book in the library.
//      * This method is not yet implemented.
//      *
//      * @throws UnsupportedOperationException if the method is called
//      */
//     public static List<String[]> find_book(String name) {
//         return BookUtils.findBook(filePath, name);
//     }

//     /**
//      * Issues a book from the library.
//      * This method is not yet implemented.
//      *
//      * @throws UnsupportedOperationException if the method is called
//      */
//     public static void issue_book(String name) {
//         List<String[]> book = find_book(name);
//         System.out.println(book);

//     }

//     /**
//      * Returns a book to the library.
//      * This method is not yet implemented.
//      *
//      * @throws UnsupportedOperationException if the method is called
//      */
//     public static void return_book() {
//         throw new UnsupportedOperationException("Not mentioned yet");
//     }
// }
