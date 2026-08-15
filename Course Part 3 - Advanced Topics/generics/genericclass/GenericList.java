package generics.genericclass;

public class GenericList<T> {
    @SuppressWarnings("unchecked")
    private T[] list = (T[]) new Object[10];
    private int count = 0;

    public void add(T elem) {
        list[count++] = elem;
    }

    public T get(int index) {
        return list[index];
    }
}
