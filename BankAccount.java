package JAVAEXAM;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.*;
public class BankAccount {
    String IBAN;
    int balance;
    String pin;

    public BankAccount(String IBAN, int balance, String pin) {
        this.IBAN = IBAN;
        this.balance = balance;
        this.pin = pin;
    }

    public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
        return this.balance;
    }


    public void withdraw(int amount) {
    	if(amount>this.balance) {
    		System.out.println("Isufficent funds");
    		System.exit(0);
    	}
        	if(amount<=this.balance) {        	
            	this.balance = this.balance - amount;
                System.out.println("You withdrew " + amount +"$ ," +balance+ "$remains");                      
                }
         else {
            System.out.println("Not enough money.");
            
        }
        }
    
    
    public void transfer(int amount,int acc1,int acc2) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
            System.out.println("The " + amount+ "is transferred from " +acc1+ "to " +acc2+ " , " +balance+" remains");
        } else {
            System.out.println("Not enough money to transfer");
        }
    }

public static void print(int optionn,int accountt) {
	Scanner scanner = new Scanner(System.in);
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
  	 LocalDateTime now = LocalDateTime.now();
  	 if(optionn==1) {
	try {
		System.out.println("enter file name: ");
		String fname = scanner.nextLine();
		
        FileWriter fw = new FileWriter(fname +".txt");
        
 	
		System.out.println("Enter file path (ex: C:\\Users\\georges.ab\\Desktop)");
		String direc = scanner.nextLine();
		System.out.println("Enter file Name +.txt: ");
		String filename=scanner.nextLine();
		String path = direc + File.separator+ filename +File.separator + filename+".txt";
        File f = new File(path);
        f.getParentFile().mkdirs(); 
        f.createNewFile();
        System.out.println("File Created!");
        
      
	
	}	catch (Exception ex) {
        ex.printStackTrace();

}
}
}
}
