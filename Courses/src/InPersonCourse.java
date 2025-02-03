
public class InPersonCourse extends CourseEL {
	
	private String roomPrefix;
	private int roomNum;

	// Constructor
	public InPersonCourse(String coursePrefix, int courseNum, int courseSection, int numStudents, 
							int maxStudents, int credits) {
		
		super(coursePrefix, courseNum, courseSection, numStudents, maxStudents, credits);
		this.setRoomNum(roomNum);
		this.setRoomPrefix(roomPrefix);
		
	}
	
	// Getters and Setters
	public String getRoomPrefix() {
		return roomPrefix;
	}

	public void setRoomPrefix(String roomPrefix) {
		this.roomPrefix = roomPrefix;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	@Override
	public String toString() {
		return "In Person Course \nCourse: " + coursePrefix + courseNum + courseSection + "\n" + 
				"Number of students: " + numStudents + "\n" +
				"Max number of students: " + maxStudents + "\n" + 
				"Credits: " + credits + "\n" +
				"Room Number: " + roomPrefix + roomNum + "\n";
	}
	
}
