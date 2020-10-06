package eerstePogingLabs.uitwerkingenHS10.CSM;

public class RegularCard extends Card {

    protected RegularCard(int cardId, String name, double credit) {
        super(cardId, name, credit);
    }

    @Override
    public boolean pay(int amount) {
        if (credit - amount < 0) {
            this.credit = credit;
            return false;
        } else {
            this.credit = credit - amount;
            return true;
        }
    }
}
