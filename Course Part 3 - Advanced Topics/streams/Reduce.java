package streams;

import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        var users = List.of(
            new User("Umair", 20, 3.83),
            new User("Anwar", 50, 3.50),
            new User("Huzaifa", 25, 3.23),
            new User("Safiullah", 23, 3.34)
        );

        
        // reduce() method is just like JavaScript's reduce() method
        
        Optional<Double> sum = users
        .stream()
        .filter((user) -> user.getGpa() >= 3.5)
        .map(User::getGpa)
        .reduce((gpa1, gpa2) -> gpa1 + gpa2);
        // OR
        // .reduce(Double::sum)
        
        System.out.println("\n" + "Sum of GPAs of students having GPA >= 3.5: " + sum.orElse(0.00));


        // We can also provided the initial value to the reduce method:

        Double multiplication = users
        .stream()
        .filter((user) -> user.getGpa() >= 3.5)
        .map(User::getGpa)
        .reduce(1.00, (gpa1, gpa2) -> gpa1 * gpa2);
        
        System.out.println("\n" + "Multiplication of GPAs of students having GPA >= 3.5: " + multiplication + "\n\n");
    }
}
