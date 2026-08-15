package generics.genericclass;

public class UseGenericClass {

    public static void main(String[] args) {
        var cars = new GenericList<String>();
        cars.add("Corolla");
        cars.add("Vitz");
        cars.add("Revo");
        System.out.println(cars.get(1));
    }    
}
    