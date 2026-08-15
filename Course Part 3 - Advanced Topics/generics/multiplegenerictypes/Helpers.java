package generics.multiplegenerictypes;

public class Helpers {

    // GENERIC METHOD WITH MULTIPLE GENERIC TYPES
    public static <K, V> void printKeyValuePair(K a, V b) {
        System.out.println("Key: " + a + "   -----   " + "Value: " + b);
    }    
    
}
