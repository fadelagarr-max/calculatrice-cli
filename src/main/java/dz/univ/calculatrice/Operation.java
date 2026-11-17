package dz.univ.calculatrice;

public interface Operation {

    double execute(double num1, double num2);

    String getSymbol();
}