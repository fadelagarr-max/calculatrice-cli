package dz.univ.calculatrice;

/**
 * Cette classe représente l'opération de soustraction.
 */
public class SubtractOperation implements Operation {

    @Override
    public double execute(final double num1, final double num2) {
        return num1 - num2;
    }

    @Override
    public String getSymbol() {
        return "-";
    }
}
