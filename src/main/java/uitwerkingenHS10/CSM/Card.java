package uitwerkingenHS10.CSM;

public abstract class Card  {

   final int cardId;
   String name;
   double credit;

    protected Card(int cardId, String name, double credit) {
        this.cardId = cardId;
        this.name = name;
        this.credit = credit;
    }

    public abstract boolean pay(int amount);
}

