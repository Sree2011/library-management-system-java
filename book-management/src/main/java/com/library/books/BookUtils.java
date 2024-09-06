package com.library.books;

import java.util.HashMap;

import org.dflib.DataFrame;
import org.dflib.csv.Csv;

public class BookUtils {

    public static void appendDictToCsv(String filePath, HashMap<String, String> myDict) {
        try {
            DataFrame df = Csv.load(filePath);
            DataFrame newRow = DataFrame
        .byArrayRow("name", "author","volume","issued") 
        .appender() 
        .append(myDict.get("name"), myDict.get("author"),myDict.get("volume"),myDict.get("issued"))
        .toDataFrame();
            df = df.vConcat(newRow);
            Csv.save(df, filePath);
            System.out.println("List appended to " + filePath + " successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static DataFrame getBooks(String filePath) {
        return Csv.load(filePath);
    }

    public static DataFrame findBook(String filePath, String name) {
        DataFrame books = getBooks(filePath);
        if (books.height() == 0) {
            return DataFrame.empty();
        }
        return books.rows(row -> row.get("name").toString().equalsIgnoreCase(name)).select();
    }

    public static DataFrame updateBookStatus(String filePath, String name, String status){
     
        DataFrame books = Csv.load(filePath); // Read the CSV data

        DataFrame upData = findBook(filePath, name);
        books.

        //Csv.save(upData,filePath);

        // Update the DataFrame with changes from the map
        
       
        return upData;
      

        

}

    public static void main(String[] args) {
        String filePath = "./book-management/src/data/books.csv";
        HashMap<String, String> map = new HashMap<>();
        String[] keys = {"name", "author", "volume", "issued"};
        String[] values = {"value1", "value2", "value3", "no"};

        // Map keys to values
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }

        // Print the HashMap
        // System.out.println(map);
        // appendDictToCsv(filePath, map);

        // Find a book
        DataFrame foundBook = findBook(filePath, "Sree Basics");
        System.out.println("Found Book: " + foundBook);

        // Update book status
        System.out.println(updateBookStatus(filePath, "Sree Basics", "yes"));
    }
}
