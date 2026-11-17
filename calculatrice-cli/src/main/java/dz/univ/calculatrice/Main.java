package dz.univ.calculatrice;

import java.util.Scanner;

/**
 * Classe principale pour lancer l'application calculatrice.
 */
public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final AddOperation addition = new AddOperation();
        final SubtractOperation soustraction = new SubtractOperation();

        while (true) {
            System.out.println("\n--- CALCULATRICE ---");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            if (!scanner.hasNextInt()) {
                System.out.println("Choix invalide.");
                scanner.next();
                continue;
            }

            final int choix = scanner.nextInt();

            if (choix == 0) {
                System.out.println("Au revoir !");
                break;
            }

            if (choix != 1 && choix != 2) {
                System.out.println("Choix invalide.");
                continue;
            }

            System.out.print("Premier nombre : ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Nombre invalide.");
                scanner.next();
                continue;
            }
            final double num1 = scanner.nextDouble();

            System.out.print("Deuxième nombre : ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Nombre invalide.");
                scanner.next();
                continue;
            }
            final double num2 = scanner.nextDouble();

            if (choix == 1) {
                System.out.println("Résultat : " + addition.execute(num1, num2));
            } else {
                System.out.println("Résultat : " + soustraction.execute(num1, num2));
            }
        }
        scanner.close();
    }
}
