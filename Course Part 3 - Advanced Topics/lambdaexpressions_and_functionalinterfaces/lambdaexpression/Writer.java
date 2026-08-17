package lambdaexpressions_and_functionalinterfaces.lambdaexpression;

public class Writer {
    public static void main(String[] args) {

        // This procedure of passing the anonymous implementation of a class
        // to a funciton is called "Anonymous Inner Class"

        wirteToScreen((message) -> {
            System.out.println(message);
        });        
    }

    public static void wirteToScreen(Writeable writeable) {
        writeable.write("Hello, to the world!");
    }
}
