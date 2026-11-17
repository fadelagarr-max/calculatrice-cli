package dz.univ.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddOperationTest {
    @Test
    public void testExecute() {
        final AddOperation add = new AddOperation();
        assertEquals(5.0, add.execute(2.0, 3.0), 0.001);
    }
}
