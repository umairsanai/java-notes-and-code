package lambdaexpressions_and_functionalinterfaces.anonymousinnerclass;

public class Writer {
    public static void main(String[] args) {

        // This procedure of passing the anonymous implementation of a class
        // to a funciton is called "Anonymous Inner Class"

        writeToScreen(new Writeable() {
            @Override
            public void write(String message) {
                System.out.println(message);
            }
        });        
    }

    public static void writeToScreen(Writeable writeable) {
        writeable.write("Hello, to the world!");
    }
}
