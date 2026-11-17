package dz.univ.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Classe de test pour SubtractOperation.
 */
public class SubtractOperationTest {

    @Test
    public void testExecute() {
        final SubtractOperation sub = new SubtractOperation();

        assertEquals(1.0, sub.execute(3.0, 2.0), 0.001);
        assertEquals(-3.0, sub.execute(2.0, 5.0), 0.001);
        assertEquals(1.0, sub.execute(-2.0, -3.0), 0.001);
    }

    @Test
    public void testGetSymbol() {
        final SubtractOperation sub = new SubtractOperation();

        assertEquals("-", sub.getSymbol());
    }
}
