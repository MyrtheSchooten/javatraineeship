package uitwerkingenHS5;

public class Start {
    public static void main(String[] args) {
        LabVijf labVijf = new LabVijf();

        int antwoord1 = labVijf.greatest(4,5);
        System.out.println(antwoord1);

        String antwoord2 = labVijf.greatest("kortestring", "veellangerestring");
        System.out.println(antwoord2);

        int antwoord3 = labVijf.greatest(17);
        System.out.println(antwoord3);

        int antwoordFactorial = labVijf.factorial(5);
        System.out.println(antwoordFactorial);

    }


}
