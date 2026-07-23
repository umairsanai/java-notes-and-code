import java.util.Objects;

public final class Student{
    String name;
    int age;
    double gpa;

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            return hashCode() == o.hashCode();
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n\n" +
            "Name: " + this.name + "\n" +
            "Age: " + this.age + "\n" +
            "GPA: " + this.age + "\n\n";
    }

    // NEW THING !!!
    @Override
    public int hashCode() {
        return Objects.hash(name, age, gpa);
    }
}