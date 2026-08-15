package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) {
        FileReader reader = null;
        try {

            // Checked Exception : Checked at the compile time
            reader = new FileReader("hosts.txt");
            char val = ((char)reader.read());
            System.out.println(val);
            
        } 
        catch (FileNotFoundException exception) {
            System.out.println("File Not Found!");            
        } // This is how we catch multiple types of exceptions... 
        catch (IOException exception) {
            System.out.println("Could not read!");
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }
}