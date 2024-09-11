package com.library.books;


import java.io.File;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class BookUtils {

    public static void appendDictToCsv(String filePath, HashMap<String, String> myDict) {
        Dictionary<String, Integer> dict = new Hashtable<>();
        dict.put("Alice", 25);
        dict.put("Bob", 30);
        dict.put("Charlie", 35);

        ObjectMapper gson = new ObjectMapper();
        String json;
        try {
            json = gson.writeValueAsString(dict);
            System.out.println(json);
            gson.writeValue(new File(".book-management/src/data/books.json"), dict);
            System.out.println("JSON written to file: output.json");
        } catch (Exception ex) {
            System.out.println("Error! "+ex);
        }

        
    }

    public static void getBooks(String filePath) {
        ObjectMapper gson = new ObjectMapper();
        ObjectReader sa = gson.reader();
        System.out.println(sa);
    }

    public static List<String[]> findBook(String filePath, String name) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public static void updateBookStatus(String filePath, String name, String status) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public static void main(String[] args) {
        String filepath = "./book-management/src/data/books.csv";
        HashMap<String,String> map = new HashMap<>();
        String[] keys = {"name", "author", "volume", "issued"};
        String[] values = {"Python Basics", "Sree", "1st", "no"};

        // Map keys to values
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }

        // Print the HashMap
        System.out.println(map);
        appendDictToCsv(filepath, map);
    }

}

