package eerstePogingLabs.uitwerkingenHS11;

import eerstePogingLabs.uitwerkingenHS7Lab.BelowZeroException;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<BankAccount> accounts = new ArrayList<>();
    private long accountNumber = 10L;

    public enum AccountType {
        checkingAccount, savingAccount
    }

    public BankAccount createAccount(AccountType accountType) {
        switch (accountType) {
            case checkingAccount:
                return new CheckingAccount(accountNumber++);
            case savingAccount:
                return new SavingAccount(accountNumber++);
            default:
                return null;
        }
    }

    public void addAccount(BankAccount a) {
        this.accounts.add(a);
    }

    public void printOverview() {
        for (BankAccount accounts : accounts) {
            System.out.println(accounts.naarTekst());
        }
    }

    public void transferMoney(eerstePogingLabs.uitwerkingenHS7Lab.BankAccount to, @org.jetbrains.annotations.NotNull eerstePogingLabs.uitwerkingenHS7Lab.BankAccount from, double amount) throws BelowZeroException {
        if (from.withdrawMoney(amount) > 0) {
            to.depositMoney(amount);
        }
    }

    abstract class BankAccount {
        private long accountNumber;
        private int balance;
        private double interestRate;

        public static final int MIN_BALANCE = 0;

        public BankAccount(long id) {
            this.accountNumber = Bank.this.accountNumber;
        }

        public BankAccount(double accountNumber, double balance) {
        }

        public double withdrawMoney(double toWithdraw) throws BelowZeroException {
            if (this.balance - toWithdraw > MIN_BALANCE) {
                this.balance = (int) (this.balance - toWithdraw);
                return this.balance;
            }
            throw new BelowZeroException();
        }

        public double depositMoney(double toDeposit) {
            this.balance = (int) (this.balance + toDeposit);
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

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public String naarTekst() {
            return "BankAccount:" + "accountNumber = " + accountNumber + ", balance = " + balance + ", interestRate = " + interestRate;
        }


    }

    private class CheckingAccount extends BankAccount {
        public CheckingAccount(long id) {
            super(id);
        }
    }

    private class SavingAccount extends BankAccount {
        public SavingAccount(long id) {
            super(id);
        }
    }

}

