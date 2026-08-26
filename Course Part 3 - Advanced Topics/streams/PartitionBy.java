package streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitionBy {
    public static void main(String[] args) {
        var users = List.of(
            new User("Umair", 20, 3.83),
            new User("Anwar", 50, 3.54),
            new User("Huzaifa", 20, 3.23),
            new User("Safiullah", 23, 3.34)
        );

        Predicate<User> userAgeGreaterThan20 = (user) -> user.getAge() > 20;

        var usersGroupedByAge = users
                                    .stream()
                                    .collect(Collectors.partitioningBy(
                                                    userAgeGreaterThan20, 
                                                    Collectors.mapping(
                                                            (user) -> user.getName() + " (" + user.getAge() + ")", 
                                                            Collectors.joining(", ")
                                                    )
                                            )
                                    );

        System.out.println("\n\n");
        usersGroupedByAge.forEach((age, usersNames) -> {
            System.out.println("Age > 20: " + age + "\t\t" +
                               "Names: " + usersNames + 
                               "\n\n"
            );
        });
    }
}

