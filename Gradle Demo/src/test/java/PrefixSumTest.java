import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrefixSumTest {

    @Test
    void sumInts() {
        assertEquals(5, PrefixSum.sumInts(2, 3));
        assertEquals(10, PrefixSum.sumInts(-10, 20));
        assertEquals(0, PrefixSum.sumInts(10, -10));
    }

    @Test
    void prefixSum() {
        assertArrayEquals(new int[]{1,3,6},
                PrefixSum.prefixSum(new int[]{1,2,3}));
    }
}