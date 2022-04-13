package JAVAEXAM;
import java.util.Scanner;
import java.io.*;

public class Bankingsystem {
	private static int pinAttempts = 0;

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("1", 400, "123");
        BankAccount bankAccount2 = new BankAccount("2", 600, "456");
        BankAccount bankAccount3 = new BankAccount("3", 800, "789");
        BankAccount[] bankAccounts = {bankAccount1, bankAccount2,bankAccount3};
        Scanner scanner = new Scanner(System.in);
        BankAccount currentBankAccount = null;
        while (currentBankAccount == null) {
            pinAttempts++;
            if (pinAttempts > 3) {
                System.err.println();
                System.err.println("You have exceeded the allowable number of login attempts!");
                System.err.println("The transaction is over. ");
                System.exit(0);
            }
        menu.welcome();
        String pin = scanner.nextLine();
        String acc = scanner.nextLine();
        currentBankAccount = Bankingsystem.getBankAccountByPin(bankAccounts, pin,acc);
        }
        ATM.useATM(currentBankAccount);
    }
        public static BankAccount getBankAccountByPin(BankAccount[] bankAccounts, String pin,String IBAN) {
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.IBAN.equals(IBAN) && bankAccount.pin.equals(pin) ) {
                return bankAccount;
            } else if (!bankAccount.IBAN.equals(IBAN) && !bankAccount.pin.equals(pin) ) {
                System.out.println("Wrong Pin. Try Again.");
            }
        }
        return null;
    }
}