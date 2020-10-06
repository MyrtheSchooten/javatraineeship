package eerstePogingLabs.uitwerkingenHS10.CSM;

public class Start {
    public static void main(String[] args) {

        Register klantenbestand = new Register();

        Card rcard1 = new RegularCard(1234, "Gerda", 450);
        Card rcard2 = new RegularCard(2345, "Edward", 20);
        Card rcard3 = new RegularCard(3456, "Donald", 700);

        Card gcard1 = new GoldCard(1111, "Mona", 1000, 5);
        Card gcard2 = new GoldCard(2222, "Roan", 10000, 15);
        Card gcard3 = new GoldCard(3333, "Vera", 15, 20);

        klantenbestand.addNewCard(rcard1);
        klantenbestand.addNewCard(rcard2);
        klantenbestand.addNewCard(rcard3);
        klantenbestand.addNewCard(gcard1);
        klantenbestand.addNewCard(gcard2);
        klantenbestand.addNewCard(gcard3);

        System.out.println(gcard1.credit);
        gcard1.pay(100);
        System.out.println(gcard1.credit);

        klantenbestand.printOverviewAllCards();

    }
}
