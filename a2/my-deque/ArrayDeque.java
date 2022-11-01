public class ArrayDeque <T> {

    private int size;
    private T[] items;

    // Creates an empty array deque.
    public ArrayDeque() {
        size = 0;
        items = (T[]) new Object[8];
    }

    // Creates a deep copy of other.
    public ArrayDeque(ArrayDeque other) {
        T[] copied = new T[size];
        for (int i = 0; i < size; i++) {
            copied[i] = items[i];
        }
    }

    private void grow(int capacity) {
        T[] expandedItems = new T[capacity];
        System.arraycopy(items, 0, expandedItems, 0, size);
        items = expandedItems;
    }

    // Adds an item of type T to the front of the deque.
    public void addFirst(T item) {
        if (size == items.length) {
            grow(items.length * 2);
        }

        size++;
        T[] expandedItems = new T[size];
        expandedItems[0] = item;
        System.arraycopy(items, 0, expandedItems, 1, size);
        items = expandedItems;
    }

    // Adds an item of type T to the back of the deque.
    public void addLast(T item) {
        if (size == items.length) {
            grow(items.length * 2);
        }

        items[size] = item;
        size++;
    }

    // Returns true if deque is empty, false otherwise.
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Returns the number of items in the deque.
    public int size() {
        return size;
    }

    // Returns a string showing the items in the deque from first to last,
// separated by a space.
    public String toString() {
        String ans = "";

        for (int i = 0; i < size; i++) {
            ans += items[i] + " ";
        }

        return ans;
    }

    // Removes and returns the item at the front of the deque.
// If no such item exists, returns null.
    public T removeFirst() {
        T toRemove = items[0];
        T[] temp = new T[size-1];
        System.arraycopy(items, 1, temp, 0, size-1);
        items = temp;
        size--;
        return toRemove;
    }

    // Removes and returns the item at the back of the deque.
// If no such item exists, returns null.
    public T removeLast() {
        T toRemove = items[size - 1];
        items[size - 1] = null;
        size--;
        return toRemove;
    }

    // Gets the item at the given index, where 0 is the front, 1 is the next item,
// and so forth. If no such item exists, returns null. Must not alter the deque!
    public T get(int index) {
        if (index > size - 1) {
            return null;
        } else {
            return items[index];
        }
    }

}
