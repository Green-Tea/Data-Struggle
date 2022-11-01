public class LinkedListDeque <T> {

    private static class LinkedListNode <T> {
        T head;
        LinkedListNode next;
        LinkedListNode prev;

        public LinkedListNode(T head, LinkedListNode next, LinkedListNode prev) {
            this.head = head;
            this.next = next;
            this.prev = prev;
        }
    }

    private int size;
    private LinkedListNode sentinel;
    private LinkedListNode first;
    private LinkedListNode last;

    // Creates an empty linked list deque.
    public LinkedListDeque() {
        size = 0;
        sentinel = new LinkedListNode(-1, null, null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
    }

    // Creates a deep copy of other.
    public LinkedListDeque(LinkedListDeque other) {
        LinkedListDeque copy = new LinkedListDeque();
        LinkedListNode current = sentinel.next;
        while (current != sentinel) {
            copy.addLast(current);
            current = current.next;
        }
    }

    // Adds an item of type T to the front of the deque.
    public void addFirst(T item) {
        size++;
        first = new LinkedListNode(item, sentinel.next, sentinel);
        first.next.prev = first;
        sentinel.next = first;
    }

    // Adds an item of type T to the back of the deque.
    public void addLast(T item) {
        size++;
        last = new LinkedListNode(item, sentinel, sentinel.prev);
        last.prev.next = last;
        sentinel.prev = last;
    }

    // Returns true if deque is empty, false otherwise.
    public boolean isEmpty() {
        if (sentinel.next == sentinel) {
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
        LinkedListNode current = this.sentinel.next;
        String str = "";

        while (current != sentinel) {
            str += current.head + " ";
            current = current.next;
        }
        return str;
    }

    // Removes and returns the item at the front of the deque.
// If no such item exists, returns null.
    public T removeFirst() {
        size--;
        T tempFirst = (T) sentinel.next.head;
        LinkedListNode newFirst = first.next;
        newFirst.prev = sentinel;
        sentinel.next = newFirst;
        return tempFirst;
    }

    // Removes and returns the item at the back of the deque.
// If no such item exists, returns null.
    public T removeLast() {
        size--;
        T tempLast = (T) sentinel.prev.head;
        LinkedListNode newLast = last.prev;
        newLast.next = sentinel;
        sentinel.prev = newLast;
        return tempLast;
    }

    // Gets the item at the given index, where 0 is the front, 1 is the next item,
// and so forth. If no such item exists, returns null. Must not alter the deque!
    public T get(int index) {
        LinkedListNode current = sentinel;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return (T) current.head;
    }

}