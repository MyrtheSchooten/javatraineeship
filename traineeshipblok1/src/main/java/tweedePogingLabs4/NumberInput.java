package tweedePogingLabs4;

import java.util.Scanner;

public class NumberInput {
    Scanner scanner = new Scanner(System.in);

    public void elevenProof() {
        String accountNumber = enterNumber();
        checkNumberLength(accountNumber);

        int sum = calculateSum(accountNumber);
        checkSum(sum);
    }

    public String enterNumber() {
        System.out.println("Voer een getal in.");
        return scanner.nextLine();
    }

    public void checkNumberLength(String accountNumber) {
        if (accountNumber.length() != 9) {
            throw new IllegalArgumentException("Uw bankaccountnummer moet bestaan uit 9 cijfers.");
        }
    }

    public int calculateSum(String accountNumber) {
        int sum = 0;

        try {
            for (int i = 1; i <= accountNumber.length(); i++) {
                String digit = accountNumber.charAt(i - 1) + "";
                sum += Integer.parseInt(digit) * (accountNumber.length() + 1 - i);
            }
        } catch (notANumberException e) {
            System.err.println(e.getMessage());
        }

        return sum;
    }

    public void checkSum(int sum) {
        if (sum % 11 == 0) {
            System.out.println("Accountnumber is valid");
        } else {
            throw new IllegalArgumentException("This accountnumber is not valid");
        }
    }

}
