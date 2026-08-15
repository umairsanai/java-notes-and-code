package generics.genericmethod;

public class UseGenericMethod {
    public static void main(String[] args) {
        var me = new User("Umair Anwar", 20);
        var huz = new User("Huzaifa Saleh", 22);
        System.out.println(Helpers.max(me, huz));   
    }
}