import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AllMeowsTest {

    @Test
    void noVariationTest() {
        assertArrayEquals(new int[]{}, AllMeows.allMeowLocations("helloworld"));
        assertArrayEquals(new int[]{7, 2}, AllMeows.allMeowLocations("abmeowcmeow"));
    }

    @Test
    void withVariationTest() {
        assertArrayEquals(new int[]{19, 12, 3}, AllMeows.allMeowLocations("cxmMeoWmemeeMeowmmmmeowaawaaemow"));
        assertArrayEquals(new int[]{15, 11, 7, 3}, AllMeows.allMeowLocations("ztameOwMeowmeowMEOW"));
    }
}