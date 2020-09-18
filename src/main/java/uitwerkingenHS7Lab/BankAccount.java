package uitwerkingenHS7Lab;
public class BankAccount {

    private long accountNumber;
    private double balance;
    private double interestRate;

    public static final int MIN_BALANCE = 0;

    public BankAccount(long accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double withdrawMoney(double toWithdraw) throws BelowZeroException {
        if (this.balance - toWithdraw > MIN_BALANCE) {
            this.balance = this.balance - toWithdraw;
            return this.balance;
        } throw new BelowZeroException();
    }

    public double depositMoney(double toDeposit) {
        this.balance = this.balance + toDeposit;
        return this.balance;
    }

    public double getInterest(int years) {
        return this.balance * Math.pow(1 + interestRate / 100, years);
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setInterestRate(double interestRate)
    { this.interestRate = interestRate; }

    public String naarTekst() {
        return "BankAccount:" + "accountNumber = " + accountNumber + ", balance = " + balance + ", interestRate = " + interestRate;
    }
}


