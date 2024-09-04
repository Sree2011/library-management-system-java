package com.library.books;

/**
 * The {@code Book} class represents a book in the library.
 * It contains details about the book such as its name, author, volume, and issued status.
 */
public class Book {
    /**
     * The name of the book.
     */
    String name;

    /**
     * The author of the book.
     */
    String author;

    /**
     * The volume of the book.
     */
    String volume;

    /**
     * The issued status of the book.
     */
    String issued;

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
        throw new UnsupportedOperationException("Not mentioned yet");
    }

    /**
     * Finds a book in the library.
     * This method is not yet implemented.
     *
     * @throws UnsupportedOperationException if the method is called
     */
    public static void find_book() {
        throw new UnsupportedOperationException("Not mentioned yet");
    }

    /**
     * Issues a book from the library.
     * This method is not yet implemented.
     *
     * @throws UnsupportedOperationException if the method is called
     */
    public static void issue_book() {
        throw new UnsupportedOperationException("Not mentioned yet");
    }

    /**
     * Returns a book to the library.
     * This method is not yet implemented.
     *
     * @throws UnsupportedOperationException if the method is called
     */
    public static void return_book() {
        throw new UnsupportedOperationException("Not mentioned yet");
    }
}
