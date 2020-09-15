package UitwerkingenHS1TM4;

public class OpdrachtenHS3 {


    // public <type> <naam>(...){

    // }

    public static void opdrachtDrieEen() {

        int i = 5;  // i heeft de waarde 5
        System.out.println(i);
        int x = i++; // x heeft de waarde 5 maar i krijgt de waarde 6
        System.out.println(x);
        int y = ++i; // zowel y als i hebben de waarde 7, want i was 6 + 1 = 7
        System.out.println(y);

    }

    public static void opdrachtDrieTwee() {

        int i = 2;
        int j = i < 3 ? i++ + ++i : ++i >>> 1;  // wanneer i is 2 en dus kleiner dan 3 dan j = 3 + 3.
        System.out.println(j);

    }

    public static void opdrachtDrieDrie() {
        byte a = 0b0101;
        byte b = 0b100;
        System.out.println(a + b);
    }

    public static void opdrachtDrieVier() {
        // Make a small program to calculate the time 80 hours after 23:00. Use the modulo operator.
        // Also determine how many days later it will be.


    }

    public static void opdrachtDrieVijf() {
        // . What are the ranges (minimum and maximum values) for all the known numeric primitives in java
        // (byte, int, long, short, double, float, char)?

        System.out.println("Byte:");
        System.out.println("Minimum: " + Byte.MIN_VALUE);
        System.out.println("Maximum: " + Byte.MAX_VALUE);

        System.out.println("Int:");
        System.out.println("Minimum: " + Integer.MIN_VALUE);
        System.out.println("Maximum: " + Integer.MAX_VALUE);

        System.out.println("Long:");
        System.out.println("Minimum: " + Long.MIN_VALUE);
        System.out.println("Maximum: " + Long.MAX_VALUE);

        System.out.println("Short:");
        System.out.println("Minimum: " + Short.MIN_VALUE);
        System.out.println("Maximum: " + Short.MAX_VALUE);

        System.out.println("Double:");
        System.out.println("Minimum: " + Double.MIN_VALUE);
        System.out.println("Maximum: " + Double.MAX_VALUE);

        System.out.println("Float:");
        System.out.println("Minimum: " + Float.MIN_VALUE);
        System.out.println("Maximum" + Float.MAX_VALUE);

        System.out.println("Char:");
        System.out.println("Minimum: " + Character.MIN_VALUE);
        System.out.println("Maximum: " + Character.MAX_VALUE);

        // Voor een kortere versie -- zie antwoordendocument

    }

    public static void opdrachtDrieZes() {

        // vragen


    }

}



