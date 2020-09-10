package HS3;

public class IPlusPlus {


    // public <type> <naam>(...){

    // }

    public static void opdrachtDrie(){

        // HS3.1
        int i = 5;  // i heeft de waarde 5
        System.out.println(i);
        int x = i++; // x heeft de waarde 5 maar i krijgt de waarde 6
        System.out.println(x);
        int y = ++i; // zowel y als i hebben de waarde 7, want i was 6 + 1 = 7
        System.out.println(y);

        // HS3.2
        i = 2;
        int j = i < 3 ? i++ + ++i : ++i >>> 1;  // wanneer i is 2 en dus kleiner dan 3 dan j = 3 + 3.
        System.out.println(j);

        //HS3.3
        //  Make a small program to calculate the result of the binary sum 1010 + 100.


    }

}
