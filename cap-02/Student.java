public class Student {
	private String name;
	private double gpa;

	public void setName(String studentName){
		name = studentName;
	}

	public String getName(){
		return name;
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
