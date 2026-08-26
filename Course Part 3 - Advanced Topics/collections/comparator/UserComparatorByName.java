package collections.comparator;

import java.util.Comparator;

public class UserComparatorByName implements Comparator<User> {
    @Override
    public int compare(User a, User b) {
        return a.getName().compareTo(b.getName());
    }
}
