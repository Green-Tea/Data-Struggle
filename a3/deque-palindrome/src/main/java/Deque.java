public interface Deque<T>{
    void addFirst(T item);

    void addLast(T item);

    boolean isEmpty();

    int size();

    T removeFirst();

    T get(int index);

    T removeLast();
}