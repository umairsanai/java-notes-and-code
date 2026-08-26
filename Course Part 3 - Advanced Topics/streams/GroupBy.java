package streams;

import java.util.List;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        var users = List.of(
            new User("Umair", 20, 3.83),
            new User("Anwar", 50, 3.54),
            new User("Huzaifa", 20, 3.23),
            new User("Safiullah", 23, 3.34)
        );
        
        var usersGroupedByAge = users.stream().collect(Collectors.groupingBy(User::getAge));

        System.out.println("\n\n");
        usersGroupedByAge.forEach((age, usersList) -> {
            System.out.println("Age: " + age);
            usersList.forEach(System.out::println);
            System.out.println("\n\n");
        });
    }
}
