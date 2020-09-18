package uitwerkingenHS6hw;

public class OpdrachtZes {


    public int zesEen() {
        long[] row = new long[4];
        row[2] = 3;
        long[] copy = row;
        copy[2]++;

        return (int) row[2];  // Row[2] geeft 4 omdat hij eerst 3 is, de copy en de row gelijk dus copy[2] = 3+1 en daarmee ook row[2]
    }

    public int zesTwee() {
        long[] row = new long[4];
        row[2] = 3;
        long[] copy = row;
        copy[2]++;

        return (int) row[4];  // Er is geen row[4] / out of bouds, omdat er 4 vakjes zijn: 0,1,2,3
    }

    public long[] extend(long[] input) {
        long[] copy = new long[input.length * 2];
        for (int i = 0; i < input.length; i++) { // hierdoor komen er net zoveel vakjes aan de array als er al aan zaten.
            copy[i] = input[i];
        }

        return copy;
    }



}
