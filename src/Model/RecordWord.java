/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public class RecordWord {

    private HashMap<String, String> records = new HashMap<>();

    
    
    public HashMap<String, String> getRecords() {
        return records;
    }

    public void setRecords(HashMap<String, String> records) {
        this.records = records;
    }

    public void addRecord(String word, String meaning) {
        records.put(word, meaning);
    }

    public String getMeaning(String word) {
        return records.get(word);
    }
}
