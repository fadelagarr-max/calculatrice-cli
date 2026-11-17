package dz.univ.calculatrice;

/**
 * Interface représentant une opération mathématique.
 */
public interface Operation {
    double execute(double num1, double num2);
    String getSymbol();
}
