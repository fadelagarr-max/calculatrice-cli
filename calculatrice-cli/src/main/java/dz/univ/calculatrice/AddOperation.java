package dz.univ.calculatrice;

/**
 * Classe représentant l'opération d'addition.
 */
public class AddOperation implements Operation {
    @Override
    public double execute(final double num1, final double num2) {
        return num1 + num2;
    }

    @Override
    public String getSymbol() {
        return "+";
    }
}
