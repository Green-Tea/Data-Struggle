import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestOffByOne {
    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.
    static CharacterComparator offByOne = new OffByOne();

    // Your tests go here.
    @Test
    public void testEqualChars() {
        assertEquals(true, offByOne.equalChars('a', 'b'));
        assertEquals(false, offByOne.equalChars('f', 'r'));
        assertEquals(false, offByOne.equalChars('k', 'k'));
        assertEquals(true, offByOne.equalChars('m', 'l'));
        assertEquals(false, offByOne.equalChars('c', 'a'));
    }
}

