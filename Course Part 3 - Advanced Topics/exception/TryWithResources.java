package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {

        // This is the syntax for try-with-resources block
        // We can initialize the resources in the paranthesis after "try" keyword.
        // The resources will automatically be freed by the Java Compiler
        // Note: For this to work, the resource class should implement "AutoCloseable" interface.

        try (
            var reader = new FileReader("hosts.txt");
        ) {

            // Checked Exception : Checked at the compile time
            char val = ((char)reader.read());
            System.out.println(val);
            
        } 
        catch (FileNotFoundException exception) {
            System.out.println("File Not Found!");            
        } // This is how we catch multiple types of exceptions... 
        catch (IOException exception) {
            System.out.println("Could not read!");
        }
    }
}
