package uitwerkingenHS7Lab;

import java.math.BigDecimal;

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

    public double withdrawMoney(double toWithdraw) {
        if (this.balance - toWithdraw > MIN_BALANCE) {
            this.balance = this.balance - toWithdraw;
            return this.balance;
        }
        return 0;
    }

    public double depositMoney(double toDeposit) {
        this.balance = this.balance + toDeposit;
        return this.balance;
    }

    public double getInterest(int years){
        double interest = (this.balance*interestRate)*years;
        return interest;
    }


    public long getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setInterestRate(double interestRate)
    { this.interestRate = interestRate; }

}


