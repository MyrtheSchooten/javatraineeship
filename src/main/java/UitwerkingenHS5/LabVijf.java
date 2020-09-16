package UitwerkingenHS5;

public class LabVijf {
    public int greatest(int p1, int p2) {
        //Create a method called greatest().
        //This method has two integer parameters and returns the greatest of the two parameter values.

        return Math.max(p1, p2);

        /*if (p1 >= p2) {
            return p1;
        } else {
            return p2;
        }*/
    }

    public String greatest(String p3, String p4) {
        //Overload the greatest method with 2 other methods:
        //1. method with two string parameters that returns the value of the parameter with the biggest length.

        if (p3.length() > p4.length()) {
            return p3;
        } else {
            return p4;
        }
    }

    public int greatest(int... pInts) {
        //a method with a variable-length parameter list of integers that returns the greatest of the parameters values.
        int greatestInt = pInts[0];
        for (int i : pInts)
            // Als i groter is dan "greatest int" dan is i dus de greatest int
            if (i > greatestInt) greatestInt = i;
        return greatestInt; // greatest int is dus i geworden
    }

    public int factorial(int number) {
        if (number <= 1) return 1;
        else {
            return number * factorial(number - 1);
        }
    }
}
