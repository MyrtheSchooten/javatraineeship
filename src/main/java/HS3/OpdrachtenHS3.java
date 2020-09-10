package HS3;

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

    public static void OpdrachtDrieVier() {
       // Make a small program to calculate the time 80 hours after 23:00. Use the modulo operator.
       // Also determine how many days later it will be.





    }


}


