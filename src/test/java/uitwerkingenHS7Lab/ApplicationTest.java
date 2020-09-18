package uitwerkingenHS7Lab;

import org.junit.jupiter.api.Test;
import uitwerkingenHS7hw.Person;
import uitwerkingenHS7hw.PersonDiedExeption;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    void TestWithdraw() throws BelowZeroException {
        Bank deBank = new Bank();
        BankAccount account1 = new BankAccount(123, 100, 0.01);
        deBank.addNewAccount(account1);

        account1.withdrawMoney(42);
        assertEquals(58, account1.getBalance());

    }

    @Test
    void testDeposit() {
        Bank deBank = new Bank();
        BankAccount account2 = new BankAccount(234, 167, 0.01);
        deBank.addNewAccount(account2);

        account2.depositMoney(212);
        assertEquals(379, account2.getBalance());

    }

    @Test
    void testTransfer() throws BelowZeroException {
        Bank deBank = new Bank();
        BankAccount account3 = new BankAccount(345, 167, 0.01);
        deBank.addNewAccount(account3);
        BankAccount account4 = new BankAccount(456, 27, 0.01);
        deBank.addNewAccount(account4);

        deBank.transferMoney(account4, account3, 67);
        assertEquals(100, account3.getBalance());
        assertEquals(94, account4.getBalance());
    }
}