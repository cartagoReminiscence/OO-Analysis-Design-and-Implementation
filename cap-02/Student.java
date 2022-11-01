public class Student {
	private String name;//access specifier (e.g. private, public)
	private String address;
	private double gpa;

	public Student(String studentName){// constructor
		name = studentName;
	}

	public Student(String studentName, String studentAddress){// constructor: different signature
		name = studentName;
		address = studentAddress;
	}

	public Student(){// no-argument constructor
	}

	public void setName(String studentName){
		name = studentName;
	}

	public void setAddress(String newAddress){
		address = newAddress;
	}

	public String getName(){
		return name;
	}

	public String getAddress(){
		return address;
	}

	public void addCourse(Course newCourse){
	}

	private void computeGPA(){
	}

	public double getGPA(){
		return gpa;
	}

	public void assignGrade(Course aCourse, char newGrade){
		computeGPA();
	}
}
