/**
 * The {@code Book} class represents a book in the library.
 * It contains details about the book such as its name, author, volume, and issued status.
 */
package com.library.books;

import java.util.List;


public class Book {
    /**
     * The name of the book.
     */
    private String name;

    /**
     * The author of the book.
     */
    private String author;

    /**
     * The volume of the book.
     */
    private String volume;

    /**
     * The issued status of the book.
     */
    private String issued;

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
     * Returns the value of book name
     * @return name name of the book
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the book name
     * @param name name of the book
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the value of book author
     * @return author author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the book author
     * @param author author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Returns the value of book volume
     * @return volume volume number of the book
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the value of book volume
     * @param volume volume number of the book
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    
    /**
     * Returns the value of issued status
     * @return issued the issued status of the book
     */
    public String getIssued() {
        return issued;
    }
    
    /**
     * Sets the value of issued status
     * @param issued the issued status of the book
     */
    public void setIssued(String issued) {
        this.issued = issued;
    }

    /**
     * Displays the values in book object
     */
    @Override
    public String toString() {
        return name + "," + author + "," + volume + "," + issued;
    }

    /**
     * Adds the book to the library
     * @param filePath path to the library file
    */
    public void add_book(String filePath) {
        BookUtils.appendBook(filePath, this);
    }

    /**
     * Lists all the books in the library
     * @param filePath path to the library file
    */
    public List<Book> get_all_books(String filePath){
        return BookUtils.getBooks(filePath);
    }


    /**
     * Issues the book and updates its status to "Yes"
     * @param filePath path to the library file
     * @param name name of the book to be issued
    */
    public void issue_book(String filePath, String name){
        BookUtils.updateBookStatus(filePath, name, "yes");

        System.out.println("Book issued: "+name);

    }

    /**
     * Returns the book and updates its status to "No"
     * @param filePath path to the library file
     * @param name name of the book to be issued
    */
    public void return_book(String filePath, String name){
        BookUtils.updateBookStatus(filePath, name, "no");
        System.out.println("Book returned: "+name);

    }
}
