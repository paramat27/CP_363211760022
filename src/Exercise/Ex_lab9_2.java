package Exercise;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex_lab9_2 {
    public static void main(String[] args) {

        Path pFile = Paths.get("Programing.txt");
        try {
            BufferedWriter writer = Files.newBufferedWriter(pFile,
                    StandardCharsets.UTF_8);
        writer.write("5+5=10");
        writer.newLine();
        writer.write("5+5=10");
        writer.newLine();
        writer.write("5+5=10");
        writer.newLine();
        writer.write("5+5=10");
        writer.newLine();
        writer.write("5+5=10");
        writer.newLine();
        writer.write("5+5=10");
        writer.newLine();
        writer.write("5+5=10");
        writer.newLine();
        writer.write("5+5=10");
        writer.newLine();
        writer.write("5+5=10");
        writer.newLine();
        writer.write("5+5=10");
        writer.newLine();

        writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        
        
        
        
        
        
    }
}
