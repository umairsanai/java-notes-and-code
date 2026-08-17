package collections.iterables;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {

    @SuppressWarnings("unchecked")
    private T[] items = (T[]) new Object[10];
    private int count = 0;

    public T get(int index) {
        return items[index];
    }

    public void add(T elem) {
        items[count++] = elem;
    }

    @Override
    public Iterator<T> iterator() {
        return new GenericListIterator(this);
    }

    private class GenericListIterator implements Iterator<T> {
        private GenericList<T> genericList;
        private int pointer = 0;

        public GenericListIterator(GenericList<T> genericList) {
            this.genericList = genericList;
        }
        
        @Override
        public boolean hasNext() {
            return this.pointer < this.genericList.count;
        }

        @Override
        public T next() {
            return this.genericList.get(this.pointer++);
        }
    }
}