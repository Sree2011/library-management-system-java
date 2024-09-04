package com.library.books;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

public class BookUtils {

    public static void appendDictToCsv(String filePath, HashMap<String, String> myDict) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath, true))) {
            String[] entries = {myDict.get("name"), myDict.get("author"), myDict.get("volume"), myDict.get("issued")};
            writer.writeNext(entries);
            System.out.println("List appended to " + filePath + " successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static List<String[]> getBooks(String filePath) {
        List<String[]> books = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            books = reader.readAll();
        } catch (IOException | CsvException e) {
            System.out.println("Error reading " + filePath + ": " + e.getMessage());
        }
        return books;
    }

    public static List<String[]> findBook(String filePath, String name) {
        List<String[]> books = getBooks(filePath);
        if (books.isEmpty()) {
            return Collections.emptyList();
        }
        return books.stream()
                .filter(book -> book[0].equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public static void updateBookStatus(String filePath, String name, String status) {
        List<String[]> books = getBooks(filePath);
        for (String[] book : books) {
            if (book[0].equalsIgnoreCase(name)) {
                book[3] = status;
            }
        }
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            writer.writeAll(books);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filepath = "./book-management/src/data/books.csv";
        HashMap<String,String> map = new HashMap<String,String>();
        String[] keys = {"name", "author", "volume", "issued"};
        String[] values = {"value1", "value2", "value3", "no"};

        // Map keys to values
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }

        // Print the HashMap
        System.out.println(map);
        appendDictToCsv(filepath, map);
    }

}

