package uitwerkingenHS7Lab;

public class Bank {


    private BankAccount[] accounts = new BankAccount[10];
    private int index = 0;


    public void addNewAccount(BankAccount newAccount) {
        if (index < accounts.length) {
            accounts[index] = newAccount;
            index++;
        }
    }

    public void transferMoney(BankAccount to, @org.jetbrains.annotations.NotNull BankAccount from, double amount) throws BelowZeroException {
        if (from.withdrawMoney(amount) > 0) {
            to.depositMoney(amount);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (BankAccount newAccount : accounts) {
            total += newAccount.getBalance();
        }
        return total;

    }

    public void printOverview() {
        for (BankAccount newAccount : accounts) {
            System.out.println(newAccount.naarTekst());
            ;
        }
    }
}
