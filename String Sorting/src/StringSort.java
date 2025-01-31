import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number of strings: ");		
		int numStrings = input.nextInt();
		
		String[] strings = new String[numStrings];
		
		input.nextLine();
		for(int i = 0; i < numStrings; i++) {
			System.out.println("Enter a word: ");
			strings[i] = input.nextLine();
		}
		
		// Sort and print the array in ascending (A-Z) order
        sortStrings(strings, false);
        System.out.println("\nSorted Alphabetically (A-Z):");
        printArray(strings);

        // Sort and print the array in descending (Z-A) order
        sortStrings(strings, true);
        System.out.println("\nSorted Alphabetically (Z-A):");
        printArray(strings);
	}
	
	public static void sortStrings(String[] stringArray, boolean isReverse) {
		// Loops through array of strings
		for(int i = 0; i < stringArray.length - 1; i++) {
			// Compares adjacent strings
			for(int j = 0; j < stringArray.length - 1 - i; j++) {
				// Compare current string with next string
				int compare = stringArray[j].compareTo(stringArray[j + 1]);
				
				// If not in reverse order, sort alphabetically
				if (!isReverse) {
					// If current string is greater, switch
				    if (compare > 0) {
				    	// Temporary variable to hold current string while switching
				    	String temp = stringArray[j];
				    	// Switch current string with next string
						stringArray[j] = stringArray[j + 1];
						stringArray[j + 1] = temp;
				    }
				} else {
				    if (compare < 0) {
				    	String temp = stringArray[j];
						stringArray[j] = stringArray[j + 1];
						stringArray[j + 1] = temp;
				    }
				}
			}
		}
	}
	
	public static void printArray(String[] stringArray) {
		for(String str : stringArray) {
			System.out.println(str);
		}
		
//		for (int i = 0; i < stringArray.length; i++) {
//		    String str = stringArray[i];
//		    System.out.println(str);
//		}
	}
}
