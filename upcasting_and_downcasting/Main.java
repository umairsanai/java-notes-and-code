package upcasting_and_downcasting;

public class Main {
    public static void main(String[] args) {
        
        Person someone = new Person("Anyone Else", 30);
        Student me = new Student("Umair", 20, (float) 3.83);

        foo(someone);
        foo(me);

        upcast(someone);
        upcast(me);

    }
    // Downcasting
    public static void foo(Person p) {
        System.out.println(p.toString());
    }

    public static void upcast(Person p) {
        // Trying to upcast!         // Error, if we pass Person instance! Every student is a person, but every person isn't a student!

        // ((Student) p).printStudent();


        // How can we avoid that??
        // By converting above line into this:
        
        if (p instanceof Student) {
            ((Student)p).printStudent();
        }

        // Uncomment above code, and comment this code to see the error. 
    }
}