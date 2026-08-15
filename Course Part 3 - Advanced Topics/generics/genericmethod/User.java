package generics.genericmethod;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User other) {
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
