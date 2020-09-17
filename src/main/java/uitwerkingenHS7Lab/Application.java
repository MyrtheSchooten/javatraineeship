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
    }
}
