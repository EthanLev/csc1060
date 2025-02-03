
public class RemoteCourse extends CourseEL {
	
	private String webExAddress;

	// Constructor
	public RemoteCourse(String coursePrefix, int courseNum, int courseSection, int numStudents, 
							int maxStudents, int credits) {
		
		super(coursePrefix, courseNum, courseSection, numStudents, maxStudents, credits);
		this.setAddress(webExAddress);
		
	}
	
	// Getters and Setters
	public String getAddress() {
		return webExAddress;
	}

	public void setAddress(String webExAddress) {
		this.webExAddress = webExAddress;
	}

	@Override
	public String toString() {
		return "Remote Course \nCourse: " + coursePrefix + courseNum + courseSection + "\n" + 
				"Number of students: " + numStudents + "\n" +
				"Max number of students: " + maxStudents + "\n" + 
				"Credits: " + credits + "\n" +
				"Web Address: " + webExAddress + "\n";
	}
}
