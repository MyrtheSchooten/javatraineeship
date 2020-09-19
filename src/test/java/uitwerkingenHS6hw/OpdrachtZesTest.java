package uitwerkingenHS6hw;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OpdrachtZesTest {

    @Test
    void testExtend() {
        OpdrachtZes opdrachtZes = new OpdrachtZes();

        int oplossingEen = opdrachtZes.zesEen();
        System.out.println(oplossingEen);


        long[] row = new long[4];
        row[0] = 1;
        row[1] = 2;
        row[2] = 3;
        row[3] = 4;

        Arrays.toString(opdrachtZes.extend(row));
    }


}