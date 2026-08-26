package streams;

import java.util.Comparator;
import java.util.List;

public class BultinReducers {
    public static void main(String[] args) {
        var users = List.of(
            new User("Umair", 25, 3.83),
            new User("Anwar", 50, 3.5),
            new User("Huzaifa", 20, 3.23),
            new User("Safiullah", 23, 3.34)
        );

        System.out.println("\n\n");

        System.out.println("Total Users: " + users.stream().count());
        System.out.println("Users with name \"Umair\" exists: " + users.stream().anyMatch((user) -> user.getName() == "Umair"));
        System.out.println("All users have GPA >= 3.00: " + users.stream().allMatch((user) -> user.getGpa() >= 3.00));
        System.out.println("No one has 3.5 GPA: " + users.stream().noneMatch((user) -> user.getGpa() == 3.50));
        System.out.println("First User: " + users.stream().findFirst().get());
        System.out.println("Max GPA: " + users.stream().max(Comparator.comparing(User::getGpa)).get());
        System.out.println("Min Age: " + users.stream().min(Comparator.comparing(User::getAge)).get());

        System.out.println("\n\n");
    }
}
