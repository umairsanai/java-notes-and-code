package streams;

import java.util.List;

public class Filter {
    public static void main(String[] args) {
        var users = List.of(
            new User("Umair", 20, 3.83),
            new User("Anwar", 50, 3.54),
            new User("Huzaifa", 25, 3.23),
            new User("Safiullah", 23, 3.34)
        );


        // filter() method is just like JavaScript's filter() method

        users
            .stream()
            .filter((user) -> user.getGpa() > 3.5)
            .forEach((user) -> System.out.println(user));            
    }
}
