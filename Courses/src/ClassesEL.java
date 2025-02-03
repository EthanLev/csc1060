import java.util.ArrayList;

public class ClassesEL {

	public static void main(String[] args) {
		
		ArrayList<CourseEL> courses = new ArrayList<CourseEL>();
				
		InPersonCourse ipCourse = new InPersonCourse("CSC", 119, 631, 15, 30, 4);
		//setCourseInfo(ipCourse, "CSC", 119, 631, 15, 30, 20);
		//System.out.println(ipCourse);
		
		OnlineCourse onlineCourse = new OnlineCourse("CSC", 10, 60, 30, 40, 3);
		//setCourseInfo(onlineCourse, "CSC", 119, 631, 15, 30, 20);
		//System.out.println(onlineCourse);
		
		RemoteCourse remoteCourse = new RemoteCourse("CSC", 10, 01, 25, 40, 2);
		//setCourseInfo(remoteCourse, "CSC", 119, 631, 15, 30, 20);
		//System.out.println(remoteCourse);
		
		Student ethan = new Student("Ethan", "Levesque", "S02692340");
		System.out.println(ethan);
		
		ethan.addCourse(ipCourse);
		ethan.addCourse(remoteCourse);
		ethan.addCourse(onlineCourse);
		
		ethan.printCourses();
	}
	
	public static void setCourseInfo(CourseEL course, String prefix, int number, int section, int students, int studentsMax, int credits) {
		course.setCoursePrefix(prefix);
		course.setCourseNum(number);
		course.setCourseSection(section);
		course.setNumStudents(students);
		course.setMaxStudents(studentsMax);
		course.setCredits(credits);
	}
	
	public static void printCourseInfo(CourseEL course) {
		System.out.println("Course: " + course.getCoursePrefix() + course.getCourseNum() + course.getCourseSection());
		System.out.println("Number of students: " + course.getNumStudents());
		System.out.println("Max number of students: " + course.getMaxStudents());
		System.out.println("Credits: " + course.getCredits());
		
		if(course instanceof InPersonCourse) {
			System.out.println("Room number: " + ((InPersonCourse) course).getRoomNum() + "\n");
		}
		
		if(course instanceof OnlineCourse) {
			System.out.println("Instructor Email: " + ((OnlineCourse) course).getEmail() + "\n");
		} 
		
		if(course instanceof RemoteCourse) {
			System.out.println("Web Address: " + ((RemoteCourse) course).getAddress() + "\n");
		}
	}
}
