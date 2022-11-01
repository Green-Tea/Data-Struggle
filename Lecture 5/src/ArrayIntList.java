public class ArrayIntList {

    private int[] items;
    private int size;

    public ArrayIntList() {
        items = new int[8];
        size = 0;
    }

    public void addLast(int x) {
        // items.length is our capacity
        if (size == items.length) {
            grow(items.length * 2);
        }

        items[size] = x;
        size++;
    }

    public int getFirst() {
        return items[0];
    }

    public int getLast() {
        return items[size-1];
    }

    public int removeLast() {
        int toRemove = items[size - 1];
        items[size - 1] = 0; // cleans up unused slot
        size--;
        return toRemove;
    }

    public int get(int i) {
        return items[i];
    }

    // getters - things that are allowed to be accessed by other classes
    public int size() {
        return size;
    }

    private void grow(int capacity) {
        int[] expandedItems = new int[capacity];
        System.arraycopy(items, 0, expandedItems, 0, size);
        items = expandedItems;
    }

}
