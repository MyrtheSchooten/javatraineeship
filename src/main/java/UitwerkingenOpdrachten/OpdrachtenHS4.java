package UitwerkingenOpdrachten;

import java.util.Scanner;

class Hourglass {

    public static void main(String[] args) {
        while (true) {
            try {
                testInput();
                break;
            } catch (EvenNumberException e) {
                System.err.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("Voer een getal in, geen letter.");
            }
        }

    }

    private static void testInput() throws EvenNumberException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer een oneven getal in.");
        String getal = scanner.nextLine();
        int n = Integer.parseInt(getal);

        if (n % 2 == 0) {
            throw new EvenNumberException();
        }

        printHourglass(n);

    }


    private static void printHourglass(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= n / 2 - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int j = 0; j < n - 2 * i - 2; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i <= n / 2 - 1; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();

        for (int i = n / 2 - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int j = 0; j < n - 2 * i - 2; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
