import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursivePalTest {

    @Test
    void rpTest0() {
        Integer[] a0 = {1, 1, 5, 1, 1};
        Integer[] a1 = {7, 8, 7, 7, 8, 7};
        Integer[] a2 = {2, 0, 4, 0, 2};
        Integer[] a3 = {7, 4, 5, 5, 4, 7, 9, 7, 4, 5, 5, 4, 7};
        String[]  a4 = {"he", "he", "hello", "he", "he"};

        assertTrue(new RecursivePal<>().isRecursivePalindrome(a0));
        assertTrue(new RecursivePal<>().isRecursivePalindrome(a1));
        assertFalse(new RecursivePal<>().isRecursivePalindrome(a2));
        assertFalse(new RecursivePal<>().isRecursivePalindrome(a3));
        assertTrue(new RecursivePal<>().isRecursivePalindrome(a4));
    }
}