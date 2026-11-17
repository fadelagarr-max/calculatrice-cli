package dz.univ.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SubtractOperationTest {

    @Test
    public void testExecute() {
        final SubtractOperation subtract = new SubtractOperation();

        assertEquals(2.0, subtract.execute(5.0, 3.0), 0.001);
        assertEquals(5.0, subtract.execute(2.0, -3.0), 0.001);
        assertEquals(-1.0, subtract.execute(2.0, 3.0), 0.001);
        assertEquals(2.5, subtract.execute(5.5, 3.0), 0.001);
    }

    @Test
    public void testGetSymbol() {
        final SubtractOperation subtract = new SubtractOperation();

        assertEquals("-", subtract.getSymbol());
    }
}