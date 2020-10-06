package tweedePogingLabs3;

public class Start {
    public static void main(String[] args) {

    }

    static int iPlusPlus(int i) {
        int iplusplus = i++;
        return iplusplus;
    }

    static int plusPlusJ(int j) {
        int plusPlusJ = ++j;
        return plusPlusJ;
    }

    static int BinarySum() {
        byte byte1 = 0B1010;
        byte byte2 = 0B100;
        int binarySum = byte1 + byte2;
        return binarySum;
    }

    static int TimeLater(int tijdNu, int tijdOver) {
        int urenOver = tijdOver % 24;
        if (tijdNu <= 12) {
            int tijdDan = tijdNu + urenOver;
            return tijdDan;
        } else {
            int tijdDan = (tijdNu - 24) + urenOver;
            return tijdDan;
        }
    }

    static int daysLater(int tijdOver) {
        int daysLater = tijdOver / 24;
        return daysLater;
    }

    static String printClient() {
        Client client1 = new Client("Jan");
        Client client2 = new Client("Piet");
        client2 = client1;
        client2.naam = "Joris";
        return client1.naam;
    }

}
