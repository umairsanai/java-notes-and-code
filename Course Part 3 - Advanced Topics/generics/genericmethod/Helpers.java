package generics.genericmethod;

public class Helpers {

    // GENERIC METHODS
    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) < 0 ? b : a;
    }    
}
