package streams;

import java.util.List;

public class UniqueElements {
    public static void main(String[] args) {
        var users = List.of(
            new User("Umair", 20, 3.83),
            new User("Anwar", 50, 3.54),
            new User("Huzaifa", 20, 3.23),
            new User("Safiullah", 23, 3.34)
        );


        System.out.print("\n\nWithout Distinct: ");

        users
            .stream()
            .map(User::getAge)
            .sorted((a, b) -> a - b)
            .forEach(val -> System.out.print(val + " "));            

        System.out.print("\n\nWith Distinct: ");

        users
            .stream()
            .map(User::getAge)
            .sorted((a, b) -> a - b)
            .distinct()
            .forEach(val -> System.out.print(val + " "));            

        System.out.println("\n\n");
    }
}
