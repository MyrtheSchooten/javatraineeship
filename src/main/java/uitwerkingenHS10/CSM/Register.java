package uitwerkingenHS10.CSM;

public class Register {

    private final Card[] cards = new Card[10];
    private int index = 0;

    public void addNewCard(Card newCard) {
        if (index < cards.length) {
            cards[index] = newCard;
            index++;
        }
    }

    public void printOverviewAllCards() {
        for (Card newCard : cards){
            if (newCard != null){ System.out.println(newCard.naarTekst()); }

        }
    }

    public void printOverviewRegularCards() {

    }
}
