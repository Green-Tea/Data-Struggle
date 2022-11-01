import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinOpsTest {

    @Test
    void test0() {
        List<Integer> l1 = List.of(1,2,3,4,5);
        List<Integer> l2 = List.of(2,1,5,4,3);
        List<Integer> l3 = List.of(1,5,4,3,2);
        List<Integer> l5 = List.of(5,4,3,2,1);

        MinOps minOps = new MinOps();
        assertEquals(0, minOps.minimumOps(l1,l1));
        assertEquals(3, minOps.minimumOps(l1,l2));
        assertEquals(2, minOps.minimumOps(l1,l3));
        assertEquals(1, minOps.minimumOps(l1,l5));
    }
}