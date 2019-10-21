package wksp11.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadFile {
    public static ArrayList<String[]> toLineList(String filepath) {
        ArrayList<String[]> words = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(Paths.get("").toAbsolutePath().toString() + filepath);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.split(","));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return null;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return words;
    }

    public static void main(String[] args) {
        System.out.println(Paths.get("").toAbsolutePath().toString());
        ArrayList<String[]> lines = toLineList("/src/wksp11/file/us_popular_cities.txt");
        for (String[] line: lines) {
            for (String s: line) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
