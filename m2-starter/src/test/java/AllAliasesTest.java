import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class AllAliasesTest {

    @Test
    void test0() {
        Account[] accounts = {
                new Account(5, "Gift", "giftfy@gmail.com", "1234567777"),
                new Account(11, "Ike", "hike@gmail.com", "024298123"),
                new Account(72, "C++God", "omgsan@outlook.com", "0347127211"),
                new Account(3, "2Gift-too", "u998877@student.mahidol.edu", "1234567777"),
                new Account(1, "PlanetPython", "giftfy@gmail.com", "0816654433"),
                new Account(17, "4Ike", "hike@gmail.com", "1112"),
                new Account(14, "Kite", "omgsan@outlook.com", "1112")
        };
        HashMap<Integer, Integer> expected = new HashMap<>();
        expected.put(1,1);
        expected.put(17,11);
        expected.put(3,1);
        expected.put(5,1);
        expected.put(72,11);
        expected.put(11,11);
        expected.put(14,11);
        assertEquals(expected,new AllAliases().findAllAliases(accounts));
    }
}