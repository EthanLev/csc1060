import java.util.ArrayList;

public class Student {
	private String fName, lName, sNum;
	
	private ArrayList<CourseEL> courses;

	public Student(String fName, String lName, String sNum) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.sNum = sNum;
		this.courses = new ArrayList<CourseEL>();
	}
	
	public void addCourse(CourseEL course) {
		this.courses.add(course);
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getsNum() {
		return sNum;
	}
	
	public void printCourses() {
		for(CourseEL crse : courses) {
			printCourseInfo(crse);
		}
	}
	
	private static void printCourseInfo(CourseEL course) {
		System.out.println("Course: " + course.getCoursePrefix() + course.getCourseNum() + course.getCourseSection());
		System.out.println("Number of students: " + course.getNumStudents());
		System.out.println("Max number of students: " + course.getMaxStudents());
		System.out.println("Credits: " + course.getCredits() + "\n");
		
		if(course instanceof InPersonCourse) {
			System.out.println("Room number: " + ((InPersonCourse) course).getRoomNum());
		}
		
		if(course instanceof OnlineCourse) {
			System.out.println("Instructor Email: " + ((OnlineCourse) course).getEmail());
		} 
		
		if(course instanceof RemoteCourse) {
			System.out.println("Web Address: " + ((RemoteCourse) course).getAddress());
		}
	}

	@Override
	public String toString() {
		return "Student: " + fName + ", " + lName + "\nStudent Number: " + sNum + "\n";
	}
	
	
}
