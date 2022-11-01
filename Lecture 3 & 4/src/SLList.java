public class SLList {

    private static class IntNode {
        int head;
        IntNode next;
        IntNode prev;

        public IntNode(int head, IntNode next, IntNode prev){
            this.head = head; // referring to instance variable head beacuse we use this.
            this.next = next;
            this.prev = prev;
        }
    }

    // This keeps the reference to the first node of our linked structure
    // first is not visible outside of SLList class due to private modifier
    private int size; // keeps track of current size of the list
    private IntNode sentinel;
    private IntNode first;

    // create an empty SLList
    public SLList() {
        size = 0;
        sentinel = new IntNode(-1, null, null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
    }

    // create a list with one number
    public SLList(int x) {
        size = 1;
        sentinel = new IntNode(-1, null, null);
        IntNode first = new IntNode(x, sentinel, sentinel);
        IntNode last = first;
        sentinel.next = first;
        sentinel.prev = last;
    }

    // add an integer to the front of the list
    public void addFirst(int x) {
        size++;
        first = new IntNode(x, sentinel.next, sentinel);
        first.next.prev = first;
        sentinel.next = first;
    }

    // add an integer to the back of the list
    public void addLast(int x) {
        size++;
        IntNode last = new IntNode(x, sentinel, sentinel.prev);
        last.prev.next = last;
        sentinel.prev = last;
    }

    // returns the first integer of the list
    public int getFirst() {
        return sentinel.next.head;
    }

    public int getLast() {
        return sentinel.prev.head;
    }

    // return the size of the list
    public int size() {
        return size;
    }

    public String toString() {
        IntNode current = this.sentinel.next;
        String str = "";

        while (current != sentinel){
            str += current.head + ", ";
            current = current.next;
        }
        return str;
    }

    public void removeFirst() {
        size--;
        IntNode newFirst = first.next;
        newFirst.prev = sentinel;
        sentinel.next = newFirst;
    }

    public void insert(int newValue, int k) {
        size++;
        IntNode current = sentinel;
        for (int i = 0; i < k; i++) {
            current = current.next;
        }

        IntNode ans = new IntNode(newValue, current.next, current.prev);
        ans.next.prev = ans;
        current.next = ans;
    }
}
