package tweedePogingLabs2;

import java.util.Scanner;
import static java.lang.Math.abs;

public class Start {

    public static void main(String[] args) {
        printName("Myrthe");
        useScanner();
        mathQuestion();
    }

    static void printName(String name) {
        if (name != null ) {
            System.out.println("Hello " + name);
        } else {
            System.out.println("Hello World!");
        }
    }

    static void useScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username");
        String username = scanner.nextLine();
        System.out.println("Hallo " + username);
    }

    static void mathQuestion(){
        int plusTwo = abs(-2);
        System.out.println(plusTwo);

        int plusTwoStatic = abs(-2);
        System.out.println(plusTwoStatic);
    }




}
