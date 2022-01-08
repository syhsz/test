package org.example.part2_3;


import java.io.*;
import java.util.ArrayList;

public class ReadTxtToString {
    String filePath;

    public ReadTxtToString(String filePath) {
        this.filePath = filePath;
    }

    public ArrayList<String[]> Read(){
        ArrayList<String[]> list =  new ArrayList<>();
        try {
            File file = new File (filePath);
            FileReader reader =  new FileReader(file);
            BufferedReader bf = new BufferedReader(reader);
            String line;
            while ((line=bf.readLine()) != null) {
                String[] splitedStr = line.trim().split("\\s+");
                list.add(splitedStr);
            }
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
