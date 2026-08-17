package lambdaexpressions_and_functionalinterfaces;

import java.util.function.Supplier;

public class SupplierInterface {

    public static void main(String[] args) {
        Supplier<Double> randomSupplier = () -> Math.random();

        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());
    }
}