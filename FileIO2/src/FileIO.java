import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		String filePath = "C:\\CSCCOMBOFA24ELevesque\\FileIO2\\courses.txt";
		
		String coursePrefix = "";
		int courseNum = 0;
		int courseSection = 0;
		int numStudents = 0;
		int maxStudents = 0;
		int credits = 0;
		String lastString = "";
		
		try {
			Scanner input = new Scanner(new File(filePath));
			
			while(input.hasNext()) {
				coursePrefix = input.next();
				courseNum = input.nextInt();
				courseSection = input.nextInt();
				numStudents = input.nextInt();
				maxStudents = input.nextInt();
				credits = input.nextInt();
				lastString = input.next();
				
				System.out.println(coursePrefix + courseNum + "-" + courseSection);
				System.out.println(numStudents);
				System.out.println(maxStudents);
				System.out.println(credits);
				System.out.println(lastString);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("The file is not where you thought it was.");
		}
		
		String fileOut = "courses.txt";
		
		try {
			FileWriter writer = new FileWriter(fileOut, true);
			
			String outCoursePrefix = "CSC";
			int outCourseNum = 1060;
			int outCourseSection = 631;
			int outNumStudents = 15;
			int outMaxStudents = 30;
			int outCredits = 4;
			String outLastString = "109";
			
			writer.append(outCoursePrefix + "\n");
			writer.append(outCourseNum + "\n");
			writer.append(outCourseSection + "\n");
			writer.append(outNumStudents + "\n");
			writer.append(outMaxStudents + "\n");
			writer.append(outCredits + "\n");
			writer.write(outLastString);
			
			writer.close();
			System.out.println("File written successfully");
			
		} catch (IOException e) {
			System.out.println("File failed to write");
		}
	}
}
