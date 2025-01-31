
public class NumberPairs {
	
	private int num1;
	private int num2;

	// Default constructor
	public NumberPairs() {
		this.num1 = 0;
		this.num2 = 0;
	}
	
	// Constructor with parameters
	public NumberPairs(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// Getters and Setters
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	// Print numbers in ascending order
    public void printNumbersForward()  {
		int smaller = Math.min(num1,  num2);
		int bigger = Math.max(num1,  num2);
	
		for(int i = smaller + 1; i < bigger; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
    }

    // Print numbers in descending order
    public void printNumbersBackward() {
    	int smaller = Math.min(num1, num2);
        int bigger = Math.max(num1, num2);

        for (int i = bigger - 1; i > smaller; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    // Check if larger number if divisible by smaller number
    public boolean isDivisible() {
    	int bigger = Math.max(num1,  num2);
    	int smaller = Math.min(num1,  num2);
    	
    	// Returns true if bigger number is divisible by smaller number, otherwise false
    	return bigger % smaller == 0;
    }
}
