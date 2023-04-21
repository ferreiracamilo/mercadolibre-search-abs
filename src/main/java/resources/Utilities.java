package resources;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Utilities {

    public static void writeTextFile(List<String> items){
        try (FileWriter fstream = new FileWriter("item-info.txt");
             BufferedWriter info = new BufferedWriter(fstream)) {
            for(String itemLine : items) {
                info.write(String.format("%s%n",itemLine));
                // info.write(String.format("Hello%n"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
