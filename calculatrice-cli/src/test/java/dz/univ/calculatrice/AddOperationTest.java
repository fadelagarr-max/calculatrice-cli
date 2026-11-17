package dz.univ.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Classe de test pour l'opération d'addition.
 */
public class AddOperationTest {

    @Test
    public void testExecute() {
        final AddOperation add = new AddOperation();
        assertEquals(5.0, add.execute(2.0, 3.0), 0.001);
        assertEquals(0.0, add.execute(-2.0, 2.0), 0.001);
    }
}
