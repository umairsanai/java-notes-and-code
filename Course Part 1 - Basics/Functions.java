import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
 
        greet(name);
        
        input.close();
    }   

    public static void greet(String name) {
        System.out.println("\n");
        System.out.println("Hello, Mr. " + name);
        System.out.println("\n\n");
    }
}
