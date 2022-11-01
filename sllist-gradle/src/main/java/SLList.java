public class SLList {

    private class IntNode {
        int value; // an int data item
        IntNode rest; // ref to the next node

        public IntNode(int val, IntNode r) {
            this.value = val;
            this.rest = r;
        }
    }

    private IntNode first;

    public SLList() {
        first = null;
    }


    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    public int getFirst() {
        return first.value;
    }

    public int total() {
        int ans = 0;
        IntNode current = first;
        while (current != null) {
            ans += current.value;
            current = current.rest;
        }

        return ans;
    }

    public int get(int index) {
        IntNode current = first;

        for (int i = 0; i < index; i++) {
            current = current.rest;
        }

        return current.value;
    }

    public int getLast() {
        if (first == null) {
            return -1;
        }

        IntNode current = first;
        while (current.rest != null) {
            current = current.rest;
        }

        return current.value;
    }

    public String toString() {
        if (first == null) {
            return "[]";
        }

        String str = "";
        IntNode current = first;
        while (current.rest != null) {
            str += "" + current.value + ", ";
            current = current.rest;
        }

        str += current.value;

        return "["+str+"]";
    }

}
