import java.util.LinkedList;

public class LinkedListDeque<T> extends LinkedList<T> implements Deque<T> {
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
    private LinkedListNode sentinel;

    @Override
    public T get(int index) {
        LinkedListNode current = sentinel;
        for (int i = 0; i <= index; i++) {
            current = current.next;
        }

        return (T) current.head;
    }

}