package lambdaexpressions_and_functionalinterfaces.methodreferences;

public class Writer {
    public static void main(String[] args) {

        // This is called method references:
        
        // We pass the reference to the function (like below) which completes the implementation of the abstract function 
        // defined in the expected Functional Interface (e.g. "Writeable" here)
        
        writeToScreen(ScreenWriter::doTheWork);        

        // THIS THING IS VERY SIMILAR TO JAVASCRIPT (where we can pass functions as arguments in functions)
    }

    public static void writeToScreen(Writeable writeable) {
        writeable.write("Hello, to the world!");
    }
}
