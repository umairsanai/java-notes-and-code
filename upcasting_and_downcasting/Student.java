package upcasting_and_downcasting;

public class Student extends Person {
    float gpa;

    Student(String name, int age, float gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "\n\n" +
            "Name: " + this.name + "\n" +
            "Age: " + this.age + "\n" +
            "GPA: " + this.age + "\n\n";
    }

    public void printStudent() {
        System.out.println(this.toString());
    }
}
