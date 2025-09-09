package iut.qualite.tp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    void testAdd() {
        Add add = new Add();
        int result = add.add(2, 3);
        assertEquals(5, result, "2 + 3 devrait être égal à 5");
    }
}