package lambdaexpressions_and_functionalinterfaces;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {

        Predicate<String> containsLessThanSymbol = (query) -> query.contains("<");
        Predicate<String> containsGreaterThanSymbol = (query) -> query.contains(">");

        Predicate<String> containsMaliciousHTML = containsLessThanSymbol.or(containsGreaterThanSymbol);
        
        System.out.println("\n\n");
        System.out.println("1. " + containsMaliciousHTML.test("<script></script>"));
        System.out.println("2. " + containsMaliciousHTML.test("NO HTML FOUND"));
        System.out.println("\n\n");
    }    
}
