import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[100];
		int count = 0;
		
		System.out.println("Enter positive integers and enter -1 to finish");
		
		// Loop to read through numbers
		for(int i = 0; i < 100; i++) {
			int num = input.nextInt();
			
			// Exit loop if -1 is entered
			if(num == -1) {
				break;
			}
			
			// Store input in array
			numbers[count] = num;
			count++;
		}
		
		System.out.println("Numbers in reverse order:");
		for(int i = count - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
		
	}

}
