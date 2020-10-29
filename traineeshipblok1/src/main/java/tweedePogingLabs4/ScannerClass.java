package tweedePogingLabs4;

import java.util.Scanner;

public class ScannerClass {
    private final Scanner scanner;

    public ScannerClass() {
        this(new Scanner(System.in));
    }

    ScannerClass(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getInput() {
        return scanner.nextLine();
    }
}
