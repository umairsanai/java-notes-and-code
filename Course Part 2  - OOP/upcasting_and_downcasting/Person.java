package upcasting_and_downcasting;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void eat() {
        System.out.println("Eating....");
    }
    void drink() {
        System.out.println("Drinking....");
    }
}
