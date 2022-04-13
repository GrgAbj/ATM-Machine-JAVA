package JAVAEXAM;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class ATM {
    public static void useATM(BankAccount bankAccount) {
        Scanner scanner = new Scanner(System.in);
        char option = '\0';
        do {
            menu.showMenu();
            option = scanner.next().charAt(0);
            switch (option) {
                case '1':
                    System.out.println(bankAccount.getBalance());
                    break;
                case '2':
                    System.out.println("Enter an amount to withdraw(20$-50$-100$): ");
                    int amountToWithdraw = scanner.nextInt();
                    if(amountToWithdraw!=20 && amountToWithdraw !=50 && amountToWithdraw !=100) {
                    	System.out.println("Wrong withdrawal limit");
                    	break;
                    } 
                    else {
                    System.out.println("How many times do you want to withdrawal the amount? ");
                    int times=scanner.nextInt();
                    int total=amountToWithdraw*times;
                    System.out.println(total);
                    bankAccount.withdraw(total);
                    break;
                    }
                case '3':
                    System.out.println("Enter an amount to transfer: ");
                    int amount= scanner.nextInt();
                    System.out.println("Enter first account: ");
                    int acc1=scanner.nextInt();
                    System.out.println("Enter second account: ");
                    int acc2=scanner.nextInt();                   
                    bankAccount.transfer(amount, acc1, acc2);
                    break;
                case '4':
                    if(bankAccount.balance==0) {
                    	System.out.println("You have no money");
                    	System.out.println("Do you wish to delete your account?(y/n)");
                    	String ask=scanner.nextLine();
                    	ask=scanner.nextLine();
                    	if(ask.equals("y")) {
                    		System.out.println("Account deleted");
                    		System.exit(0);
                    	}          	
                    }else {
                    	System.out.println("Your balance is not empty to delete it!");
                    }
                    break;
                case '5':               	
                	System.out.println("Enter 1 if you want to see transactions made or 2 to see withdrawal history:");
                	int optionn = scanner.nextInt();
                	
                	if(optionn==1) {
                	System.out.println("Enter account you transferred to: ");
        }
                	int accountt=scanner.nextInt();
                	BankAccount.print(optionn,accountt);
                	break;
                default:
                    System.out.println("Not a valid option. Choose another option.");
                    break;
               
            }
        } while (option != 'X');
    }
}