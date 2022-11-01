import java.util.Iterator;

public class BoundedSkipper implements Iterable<Integer> {
    int k; // number to skip
    int n; // total numbers
    int current; // current number
    int size; // size of the list to be printed out

    public BoundedSkipper(int k, int n) {
        this.k = k;
        this.n = n;
        size = 0;
        current = 0;
    }

    public Iterator<Integer> iterator() {
        return new skipper<Integer>(this);
    }

    public static void main(String[] args) {
        for (int v: new BoundedSkipper(3, 11)) {
            System.out.println(v);
        }
    }

    private class skipper<I extends Number> implements Iterator<Integer> {
        public skipper(BoundedSkipper integers) {
        }

        @Override
        public boolean hasNext() {
            return size < n;
        }

        @Override
        public Integer next() {
            size++;
            current++;
            // if the current number fits the conditions, add another number to skip it.
            // use while loop because multiple consecutive numbers may fit the condition.
            while (current % k == 0 || String.valueOf(current).contains(String.valueOf(k))) {
                current++;
            }
            return current;
        }
    }
}
