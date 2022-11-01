import java.util.Iterator;
import java.util.NoSuchElementException;
public class LinkedListDeque <T> implements Iterable <T>{

    @Override
    public Iterator<T> iterator() { return null; }

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

    public LinkedListDeque() {
        size = 0;
        sentinel = new LinkedListNode(-1, null, null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
    }

    public LinkedListDeque(LinkedListDeque other) {
        LinkedListDeque copy = new LinkedListDeque();
        LinkedListNode current = sentinel.next;
        while (current != sentinel) {
            copy.addLast(current);
            current = current.next;
        }
    }

    public void addFirst(T item) {
        size++;
        first = new LinkedListNode(item, sentinel.next, sentinel);
        first.next.prev = first;
        sentinel.next = first;
    }

    public void addLast(T item) {
        size++;
        last = new LinkedListNode(item, sentinel, sentinel.prev);
        last.prev.next = last;
        sentinel.prev = last;
    }

    public boolean isEmpty() {
        if (sentinel.next == sentinel) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

    public String toString() {
        LinkedListNode current = this.sentinel.next;
        String str = "";

        while (current != sentinel) {
            str += current.head + " ";
            current = current.next;
        }
        return str;
    }

    public T removeFirst(){
        if (size > 0) {
            T tempFirst = (T) sentinel.next.head;
            LinkedListNode newFirst = first.next;
            newFirst.prev = sentinel;
            sentinel.next = newFirst;
            size--;
            return tempFirst;
        } else {
            throw new NoSuchElementException("Cannot remove from an empty list.");
        }
    }

    public T removeLast() {
        if (size > 0) {
            size--;
            T tempLast = (T) sentinel.prev.head;
            LinkedListNode newLast = last.prev;
            newLast.next = sentinel;
            sentinel.prev = newLast;
            return tempLast;
        } else {
            throw new NoSuchElementException("Cannot remove from an empty list.");
        }
    }

    public T get(int index) {
        if (index < size && index > 0) {
            LinkedListNode current = sentinel;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            return (T) current.head;
        } else {
            throw new ArrayIndexOutOfBoundsException("The index provided is out of bounds. Make sure that it is positive and less than the size of the list.");
        }
    }

    public static void main(String[] args){
        LinkedListDeque l = new LinkedListDeque();
        //l.removeFirst();
        //l.removeLast();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        System.out.println(l.get(3));
        System.out.println(l.get(-2));
        System.out.println(l.get(1));
    }

}
