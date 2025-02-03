
public class OnlineCourse extends CourseEL {
	
	private String email;

	// Constructor
	public OnlineCourse(String coursePrefix, int courseNum, int courseSection, int numStudents, 
							int maxStudents, int credits) {
		
		super(coursePrefix, courseNum, courseSection, numStudents, maxStudents, credits);
		this.setEmail(email);
		
	}
	
	// Getters and Setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Online Course \nCourse: " + coursePrefix + courseNum + courseSection + "\n" + 
				"Number of students: " + numStudents + "\n" +
				"Max number of students: " + maxStudents + "\n" + 
				"Credits: " + credits + "\n" +
				"Email: " + email + "\n";
	}
}
