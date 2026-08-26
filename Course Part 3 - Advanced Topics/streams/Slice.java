package streams;

import java.util.List;

public class Slice {
    public static void main(String[] args) {

        
        var users = List.of(
            new User("Umair", 20, 3.83),
            new User("Anwar", 50, 3.54),
            new User("Huzaifa", 25, 3.23),
            new User("Safiullah", 23, 3.34)
        );
        
        
        System.out.println("\n\n\nORIGINAL:");
        users
            .stream()
            .forEach(System.out::println);


        // limit()

        System.out.println("\nLIMIT (3):");
        users
            .stream()
            .limit(3)
            .forEach(System.out::println);


        // skip()

        System.out.println("\nSKIP (2):");
        users
            .stream()
            .skip(2)            
            .forEach(System.out::println);
            
            
        // takeWhle()

        System.out.println("\nTAKEWHILE (GPA > 3.5):");
        users
            .stream()
            .takeWhile((user) -> user.getGpa() > 3.5)
            .forEach(System.out::println);
            
        // dropWhile()

        System.out.println("\nDROPWHILE (GPA > 3.5):");           
        users
            .stream()
            .dropWhile((user) -> user.getGpa() > 3.5)
            .forEach(System.out::println);

        System.out.println("\n\n\n");

    }
}
