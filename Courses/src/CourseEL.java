
public class CourseEL {
	
	String coursePrefix;
	int courseNum;
	int courseSection;
	int numStudents;
	int maxStudents;
	int credits;
	int roomNum;
	String email;
	String webAddress;
	
	// Constructors
//	public CourseEL() {
//		this.coursePrefix = "";
//		this.courseNum = 0;
//		this.courseSection = 0;
//		this.numStudents = 0;
//		this.maxStudents = 0;
//		this.credits = 0;
//	}
	
	public CourseEL(String coursePrefix, int courseNum, int courseSection, int numStudents, 
					int maxStudents, int credits) {
		super();
		this.coursePrefix = coursePrefix;
		this.courseNum = courseNum;
		this.courseSection = courseSection;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
		
	}
	
	// Getters and Setters
	public String getCoursePrefix() {
		return coursePrefix;
	}

	public void setCoursePrefix(String coursePrefix) {
		this.coursePrefix = coursePrefix;
	}

	public int getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
	}

	public int getCourseSection() {
		return courseSection;
	}

	public void setCourseSection(int courseSection) {
		this.courseSection = courseSection;
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	// To String
	@Override
	public String toString() {
		return "Course: " + coursePrefix + courseNum + courseSection + "\n" + 
				"Number of students: " + numStudents + "\n" +
				"Max number of students: " + maxStudents + "\n" + 
				"Credits: " + credits + "\n";
	}
}
