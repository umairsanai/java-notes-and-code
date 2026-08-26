package streams;

import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        var users = List.of(
            new User("Umair", 20, 3.83),
            new User("Anwar", 50, 3.54),
            new User("Huzaifa", 25, 3.23),
            new User("Safiullah", 23, 3.34)
        );


        System.out.println("\n\n");

        users
            .stream()
            .sorted((a, b) -> {
                if (a.getGpa() - b.getGpa() > 0)
                    return 1;
                else if (a.getGpa() - b.getGpa() < 0)
                    return -1;
                return 0;
            })
            .forEach((user) -> System.out.println(user));            


        System.out.println("\n\n");

        // Another Method (Syntax):

        users
            .stream()
            .sorted(Comparator.comparing(User::getGpa))
            .forEach((user) -> System.out.println(user));  

        System.out.println("\n\n");
    }
}
