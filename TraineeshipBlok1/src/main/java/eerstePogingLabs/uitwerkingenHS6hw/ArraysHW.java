package eerstePogingLabs.uitwerkingenHS6hw;

import java.util.Arrays;

public class ArraysHW {
    public static void main(String[] args) {
       OpdrachtZes opdrachtZes = new OpdrachtZes();

       int oplossingEen = opdrachtZes.zesEen();
       System.out.println(oplossingEen);


        long[] row = new long[4];
        row[0] = 1;
        row[1] = 2;
        row[2] = 3;
        row[3] = 4;
        System.out.println(Arrays.toString(opdrachtZes.extend(row)));

        long[] dubbeleRow =  opdrachtZes.multiply(row, 2);
        System.out.println(Arrays.toString(dubbeleRow));

    }
}

