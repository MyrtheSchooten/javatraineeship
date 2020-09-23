package uitwerkingenHS10.CSM;

public class Start {
    public static void main(String[] args) {

        Card rcard1 = new RegularCard(1234, "Gerda", 450);
        Card rcard2 = new RegularCard(2345, "Edward", 20);
        Card rcard3 = new RegularCard(3456, "Donald", 700);

        Card gcard1 = new GoldCard(1111, "Mona", 2000, 20);
        Card gcard2 = new GoldCard(2222, "Roan", 10000, 15);
        Card gcard3 = new GoldCard(3333, "Vera", 15, 45);

        System.out.println(gcard1.credit);

    }
}
