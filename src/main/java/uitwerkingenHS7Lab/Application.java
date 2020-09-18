package uitwerkingenHS7Lab;

public class Application {
    public static void main(String[] args) {

        Bank deBank = new Bank();


        BankAccount account1 = new BankAccount(123, 100, 0.01);
        BankAccount account2 = new BankAccount(234, 100, 0.02);
        BankAccount account3 = new BankAccount(345, 100, 0.03);
        BankAccount account4 = new BankAccount(456, 100, 0.04);
        BankAccount account5 = new BankAccount(567, 100, 0.05);
        BankAccount account6 = new BankAccount(678, 100, 0.06);
        BankAccount account7 = new BankAccount(789, 100, 0.07);
        BankAccount account8 = new BankAccount(890, 100, 0.08);
        BankAccount account9 = new BankAccount(901, 100, 0.09);
        BankAccount account10 = new BankAccount(101, 100, 0.10);

        deBank.addNewAccount(account1);
        deBank.addNewAccount(account2);
        deBank.addNewAccount(account3);
        deBank.addNewAccount(account4);
        deBank.addNewAccount(account5);
        deBank.addNewAccount(account6);
        deBank.addNewAccount(account7);
        deBank.addNewAccount(account8);
        deBank.addNewAccount(account9);
        deBank.addNewAccount(account10);


        //  It must be possible to withdraw and deposit money from and to a bank account.
        try {
            account1.withdrawMoney(50);
            System.out.println("New balance on account " + account1.getAccountNumber() + " after withdraw = " + account1.getBalance());
        } catch (BelowZeroException e) {
            System.err.println(e.getMessage());
        }

        account1.depositMoney(23);
        System.out.println("New balance on account " + account1.getAccountNumber() + " after deposit = " + account1.getBalance());

        //  it should allow a user to transfer money between those bank accounts
        try {
            deBank.transferMoney(account3, account4, 136);
        } catch ( BelowZeroException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("New balance on account " + account3.getAccountNumber() + " after tranfering money to account " + account4.getAccountNumber() + " = " + account3.getBalance());
        System.out.println("New balance on account " + account4.getAccountNumber() + " after receiving money from account " + account3.getAccountNumber() + " = " + account4.getBalance());

        //to get information about the total amount of money that is currently in the bank.
        System.out.println(deBank.calculateTotal());

        //The accounts must also be able to calculate the interest for one year and return it.
        System.out.println(account5.getInterest(1));

        //Accounts don’t allow a negave balance.
        //So when subtracng money you have to check whether the balance is large enough to allow for the withdrawal
        try {
            account6.withdrawMoney(130);
            System.out.println("New balance on account " + account1.getAccountNumber() + " after withdraw = " + account1.getBalance());
        } catch (BelowZeroException e) {
            System.err.println(e.getMessage());
        }

        //Prints overview of all bankaccounts within deBank
        deBank.printOverview();

    }
}
