package streams;

public class User {
    private String name;
    private int age;
    private double gpa;

    public User(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void printUser() {
        System.out.println(this.toString());
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + 
            "   ------   " + "Age: " + this.age +
            "   ------   " + "GPA: " + this.gpa; 
    }
}
