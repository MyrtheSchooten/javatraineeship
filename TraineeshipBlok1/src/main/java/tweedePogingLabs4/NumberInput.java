package tweedePogingLabs4;

import java.util.Scanner;

public class NumberInput {
    Scanner scanner = new Scanner(System.in);

    double accountNumber;

    public double checkIfNumber() {
        try {
            System.out.println("Voer een getal in.");
            accountNumber = Double.parseDouble(scanner.nextLine());
            this.accountNumber = accountNumber;
        } catch (notANumberException e) {
            System.err.println(e.getMessage());
        }
        return accountNumber;
    }

    public void printAccountNumber(double accountNumber){
        System.out.println(accountNumber);
    }

}
