package uitwerkingenHS10.CSM;

public class GoldCard extends Card {

    private int discount;

    protected GoldCard(int cardId, String name, double credit, int discount) {
        super(cardId, name, credit);
        this.setDiscount(discount);
    }


    public int setDiscount(int discount) throws OutOfRangeException {
        if (discount >= 1 && discount <= 30) {
            this.discount = discount;
            return discount;
        } throw new OutOfRangeException();
    }

    public int getDiscount(int discount) throws OutOfRangeException {
        this.discount = discount;
        return discount;
    }

    @Override
    public boolean pay(int amount) {
        double amountAfterDiscount = amount - discount;
        this.credit = credit - amountAfterDiscount;
        return true;
    }


}
