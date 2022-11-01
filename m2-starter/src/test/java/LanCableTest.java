import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LanCableTest {

    @Test
    void test0() {
        int n = 6;
        int[] u = {1,4,5,6,5,1,2};
        int[] v = {4,5,6,3,2,2,3};
        int[] l = {10,7,4,3,1,5,2};
        LanCable lanCable = new LanCable();
        assertEquals(14, lanCable.findMaxTotalLength(n, u, v, l));
    }

}