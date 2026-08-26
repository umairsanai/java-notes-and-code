package collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> boys = new ArrayList<>(
            List.of(
                new User("Umair Anwar", 20), 
                new User("Huzaifa Saleh", 25)
        )); 

        // With Proper Class Impelementation
        Collections.sort(boys, new UserComparatorByName());

        // With Lambda Expression:
        // Collections.sort(boys, (a, b) -> a.getName().compareTo(b.getName()));

        System.out.println(boys);
    }
}
