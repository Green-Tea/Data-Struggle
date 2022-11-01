import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void testCatConstructor() {
        Cat cat = new Cat("Meow0", 11, 25);
        assertEquals("Meow0", cat.getName());
        assertEquals(25, cat.getWeight());
        assertEquals(11, cat.getAge());
    }
}