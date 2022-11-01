import java.util.List;
import java.util.function.Predicate;

public class SLList<T> {
    // an inner storage node class
    static private class Node<T> {
        T head;
        Node<T> next;
        Node(T head, Node<T> next) {
            this.head = head;
            this.next = next;
        }
    }

    private Node<T> sentinel;
    private int size;

    public SLList() { sentinel = new Node<>(null, null); size = 0; }
    public SLList(List<T> existing) {
        // TODO: write me
    }

    // return the first item of the list
    public T getFirst() {
        return sentinel.next.head;
    }

    public T[] toArray() {
        // TODO: write me
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        // TODO: write me
        return sb.toString();
    }

    public void deleteIf(Predicate<T> p) {
        // TODO: write me
    }

    public SLList<T> reversed() {
        // TODO: write me
        return null;
    }

    @Override
    public boolean equals(Object other) {
        // TODO: write me
        return false;
    }

    static class BanA implements Predicate<String> {
        public boolean test(String t) { return t.equals("a"); }
    }

    public static void main(String[] args) {
        SLList<String> list1 = new SLList<>(List.of("J", "a", "v", "a", "S", "E"));
        SLList<String> list2 = new SLList<>(List.of("J", "a", "v", "a", "S", "E"));

        System.out.println(list1.toString());    // should print [J, a, v, a, S, E]
        System.out.println(list1.equals(list2)); // should print true

        list1.deleteIf((String e) -> e.equals(e.toUpperCase()));
        list2.deleteIf(new BanA());
        System.out.println(list1.toString());    // should print [a, v, a]
        System.out.println(list2.toString());    // should print [J, v, S, E]
        SLList<String> list5 = list2.reversed();
        System.out.println(list5.toString());    // should print [E, S, v, J]
        SLList<String> list6 = new SLList<>(List.of("E, S, v, J"));
        System.out.println(list6.equals(list5)); // should print false
    }
}
