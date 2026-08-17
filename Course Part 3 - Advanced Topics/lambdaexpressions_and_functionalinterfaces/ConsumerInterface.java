package lambdaexpressions_and_functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerInterface {

    public static void main(String[] args) {
        Consumer<String> greet = (name) -> System.out.println("Hello, Dear " + name); 
        Consumer<String> sayWelcome = (name) -> System.out.println("Welcome Back!");

        // This is how we can chain multiple lamba expressions
        Consumer<String> greetAndWelcome = greet.andThen(sayWelcome);
        greetAndWelcome.accept("Umair");        
    }
}
