package streams;

import java.util.List;

public class Peek {
    public static void main(String[] args) {
        var users = List.of(
            new User("Umair", 20, 3.83),
            new User("Anwar", 50, 3.54),
            new User("Huzaifa", 20, 3.23),
            new User("Safiullah", 23, 3.34)
        );

        System.out.println("\n\n");


        // peek() method enables us to see the values after each operation and helps us in debugging also. 

        users
            .stream()
            .sorted((a, b) -> a.getAge() - b.getAge())
            .peek((user) -> {
                System.out.println("Before Map (Peek 1): ");
                user.printUser();
            })
            .map(User::getAge)
            .peek((age) -> {
                System.out.println("After Map (Peek 2): ");
                System.out.println("Age: " + age + "\n\n\n");
            }).forEach((age) -> System.out.println("Age (forEach): " + age + "\n\n\n"));

        System.out.println("\n\n");
    }
}
