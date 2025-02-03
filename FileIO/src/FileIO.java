import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		String filePath = "C:\\CSCCOMBOFA24ELevesque\\FileIO\\items.txt";
		double subtotal = 0;
		double taxes = 0;
		double total = 0;
		
		try {
			Scanner fileIn = new Scanner(new File(filePath));
			
			while(fileIn.hasNextDouble()) {
				double val = fileIn.nextDouble();
				subtotal += val;
			}
			
			taxes = subtotal * 0.0805;
			total = subtotal + taxes;
			System.out.println("Items added to total.");
			System.out.println(subtotal);
			System.out.printf("%.2f\n", taxes);
			System.out.printf("%.2f\n", total);

			
		} catch (FileNotFoundException e) {
			System.out.println("The file is not where you thought it was.");
		}
		
		String fileOut = "C:\\CSCCOMBOFA24ELevesque\\FileIO\\total.txt";
		
		try {
			FileWriter writer = new FileWriter(fileOut);
			
			String line1 = String.format("Your sub total is $%.2f\n", subtotal);
			String line2 = String.format("Your tax is $%.2f\n", taxes);
			String line3 = String.format("Your total is $%.2f\n", total);
			
			writer.write(line1);
			writer.write(line2);
			writer.write(line3);
			writer.close();
			
		} catch (IOException e) {
			System.out.println("It broke...");
		}
	}

}
