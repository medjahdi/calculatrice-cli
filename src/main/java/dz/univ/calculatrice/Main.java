package dz.univ.calculatrice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operation add = new AddOperation();
        Operation sub = new SubtractOperation();

        while (true) {
            System.out.println("=== CALCULATRICE ===");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            if (!scanner.hasNextInt()) {
                break;
            }
            int choix = scanner.nextInt();

            if (choix == 0) {
                break;
            }

            Operation op;
            if (choix == 1) {
                op = add;
            } else if (choix == 2) {
                op = sub;
            } else {
                System.out.println("Choix invalide.");
                continue;
            }

            System.out.print("Premier nombre : ");
            double a = scanner.nextDouble();
            System.out.print("Deuxième nombre : ");
            double b = scanner.nextDouble();

            double resultat = op.execute(a, b);
            System.out.println("Résultat : " + resultat);
            System.out.println();
        }
        scanner.close();
    }
}
