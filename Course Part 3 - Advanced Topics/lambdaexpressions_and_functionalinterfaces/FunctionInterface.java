package lambdaexpressions_and_functionalinterfaces;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {

        Function<String, String[]> splitCommaSeparatedValues = (str) -> str.split(",");
        Function<String[], String[]> capitalizeEveryLetter = (arr) -> {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i].toUpperCase();
            }
            return arr;
        }; 

        String[] arr = splitCommaSeparatedValues.andThen(capitalizeEveryLetter).apply("umair,anwar");
        printStringArray(arr);
    }

    public static void printStringArray(String[] arr) {
        System.out.print("\n\n[");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length-1 ? ", " : ""));
        }

        System.out.print("]\n\n\n");
    }
}
