import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Create object
		NumberPairs pair = new NumberPairs();
		
		System.out.println("Default Output: ");
		System.out.println("num1: " + pair.getNum1());
        System.out.println("num2: " + pair.getNum2());
        
        // Create object using constructor
        NumberPairs pair2 = new NumberPairs(5, 10);
        
        System.out.println("Constructor Output: ");
        System.out.println("num1: " + pair2.getNum1());
        System.out.println("num2: " + pair2.getNum2());
    	
        // Create an array of NumberPairs
        NumberPairs[] pairs = new NumberPairs[20]; 
        int index = 0;
        
        while(true) {
        	System.out.println("Enter number pairs, 0 0 to stop");
        	int num1 = input.nextInt();
        	int num2 = input.nextInt();
        	
        	if(num1 == 0 && num2 == 0) {
        		// Break from loop
        		break;
        	}
        	
        	// Add numbers to array
        	pairs[index] = new NumberPairs(num1, num2);
        	index++;
        }
        
        for(int i = 0; i < index; i++) {
        	System.out.println("Pair " + (i + 1) + ": " + pairs[i].getNum1() + ", " + pairs[i].getNum2());
        }
        
        System.out.println("Do you want to print the numbers forward or backward? (Forward/Backward)");
        String response = input.next();
        
        if(response.equalsIgnoreCase("forward")) {
        	for(int i = 0; i < index; i++) {
        		System.out.println("Numbers between " + pairs[i].getNum1() + " and " + pairs[i].getNum2() + ":");
        		pairs[i].printNumbersForward();
        	}
        } else if(response.equalsIgnoreCase("backward")) {
        	for(int i = 0; i < index; i++) {
        		System.out.println("Numbers between " + pairs[i].getNum1() + " and " + pairs[i].getNum2() + ":");
        		pairs[i].printNumbersBackward();
        	}
        } else {
        	System.out.println("Invalid choice. Printing numbers in ascending order");
        	for(int i = 0; i < index; i++) {
        		System.out.println("Numbers between " + pairs[i].getNum1() + " and " + pairs[i].getNum2() + ":");
        		pairs[i].printNumbersForward();
        	}
        }
        
        System.out.println("Do you want to check divisibility for each pair? (yes/no): ");
        String choice = input.next();
        
        if (choice.equalsIgnoreCase("yes")) {
            for (int i = 0; i < index; i++) {
            	System.out.println("Number pair " + (i + 1) + ": " + pairs[i].getNum1() + ", " + pairs[i].getNum2());
                System.out.println("Is divisible: " + pairs[i].isDivisible());
            }
        }
	}
}
