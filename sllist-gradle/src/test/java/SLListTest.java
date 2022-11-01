import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SLListTest {

    @Test
    void testTotal() {
        SLList l = new SLList();
        l.addFirst(5);
        l.addFirst(6);
        assertEquals(11, l.total());
        SLList k = new SLList();
        k.addFirst(3);
        k.addFirst(0);
        k.addFirst(-1);
        assertEquals(2, k.total());
    }

    @Test
    void testGet() {
        SLList l = new SLList();
        l.addFirst(3);
        l.addFirst(2);
        l.addFirst(6);
        assertEquals(2, l.get(1));
        assertEquals(6, l.get(0));
        assertEquals(3, l.get(2));
    }

    @Test
    void testGetLast() {
        SLList l = new SLList();
        l.addFirst(5);
        l.addFirst(4);
        l.addFirst(3);
        assertEquals(5, l.getLast());
        SLList k = new SLList();
        assertEquals(-1, k.getLast());
    }

    @Test
    void testToString() {
        SLList l = new SLList();
        l.addFirst(6);
        l.addFirst(6);
        l.addFirst(6);
        assertEquals("[6, 6, 6]", l.toString());
        SLList k = new SLList();
        assertEquals("[]", k.toString());
    }
}