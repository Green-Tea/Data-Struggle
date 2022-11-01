import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestOffByNTest {

    @Test
    void testEqualChars() {
        //abcdefghijklmnopqrstuvvwxyz
        OffByN offBy5 = new OffByN(5);
        assertEquals(true, offBy5.equalChars('a', 'f'));
        assertEquals(true, offBy5.equalChars('k', 'f'));
        assertEquals(false, offBy5.equalChars('d', 'h'));
        assertEquals(false, offBy5.equalChars('z', 'e'));

        OffByN offBy0 = new OffByN(0);
        assertEquals(true, offBy0.equalChars('a', 'a'));
        assertEquals(false, offBy0.equalChars('a', 'b'));
        assertEquals(false, offBy0.equalChars('y', 'x'));
    }
}