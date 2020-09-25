package tddStringCalculator;

public class StringCalculator {

    public int add(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Not yet implemented");
        }
    }

}


