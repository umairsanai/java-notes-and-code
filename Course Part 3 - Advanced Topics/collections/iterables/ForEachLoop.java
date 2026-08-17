package collections.iterables;

public class ForEachLoop {
    public static void main(String[] args) {
        var arr = new GenericList<Integer>();

        for (int i = 1; i <= 5; i++) {
            arr.add(i);
        }

        for (int i : arr) {
            System.out.println(i);
        }        
    }    
}
