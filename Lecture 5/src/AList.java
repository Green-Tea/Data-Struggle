public class AList<T> {

    private T[] items;
    private int size;

    public AList() {
        items = (T[]) new Object[8];
        size = 0;
    }

    private void grow(int capacity) {
        T[] expandedItems = new T[capacity];
        System.arraycopy(items, 0, expandedItems, 0, size);
        items = expandedItems;
    }

    public void addLast(T x) {
        if (size == items.length) {
            grow(items.length * 2);
        }

        items[size] = x;
        size++;
    }

    public void addFirst(T x) {
        if (size == items.length) {
            grow(items.length * 2);
        }

        size++;
        T[] expandedItems = new T[size];
        expandedItems[0] = x;
        System.arraycopy(items, 0, expandedItems, 1, size);
        items = expandedItems;
    }


    public T getFirst() {
        return items[0];
    }

    public T getLast() {
        return items[size-1];
    }

    public T removeLast() {
        T toRemove = items[size - 1];
        items[size - 1] = null;
        size--;
        return toRemove;
    }

    public T get(int i) {
        return items[i];
    }

    public int size() {
        return size;
    }
}
