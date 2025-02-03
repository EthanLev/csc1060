import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
	private double balance;
	private ArrayList<String> transactionHistory;
	
	// Constructor
	public BankAccount() {
		this.balance = 0.0;
		this.transactionHistory = new ArrayList<>();
	}
	
	// Main method to run program
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		Scanner scanner = new Scanner(System.in);
		
		// Menu loop
		while(true) {
			System.out.println("\nATM Menu:");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Show Transaction History");
			System.out.println("5. Exit");
			
			int choice =  scanner.nextInt();
			
			switch(choice) {
			case 1:
				account.checkBalance();
				break;
			case 2:
				System.out.println("Enter deposit amount: ");
				double depositAmount = scanner.nextDouble();
				account.deposit(depositAmount);
				break;
			case 3:
				System.out.println("Enter withdraw amount: ");
				double withdrawAmount = scanner.nextDouble();
				account.withdraw(withdrawAmount);
				break;
			case 4:
				account.showHistory();
				break;
			case 5:
				System.out.println("Goodbye");
				break;
			default:
				System.out.println("Invalid selection. Please try again.");
			}
		}
	}
	
	// Method to check balance
	public void checkBalance() {
		System.out.println("Current Balance: $" + balance);
	}
	
	// Method to deposit money
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			transactionHistory.add("Deposited: $" + amount);
			System.out.println("Successfully deposited $" + amount);
		} else {
			System.out.println("Deposit amount must be positive");
		}
	}
	
	 // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: $" + amount);
            System.out.println("Successfully withdrew $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    
    // Method to display transaction history
    public void showHistory() {
    	System.out.println("Transaction History: ");
    	if(transactionHistory.isEmpty()) {
    		System.out.println("No transactions available");
    	} else {
    		// Loops through all elements of transactionHistory and prints each
    		for(String transaction : transactionHistory) {
    			System.out.println(transaction);
    		}
    	}
    }
}
