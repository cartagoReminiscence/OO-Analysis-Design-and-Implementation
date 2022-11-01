public class Course {
	private String id;
	private String name;
	private int numberOfCredits;
	private String description;

	public Course(String courseId, String courseName){
		id = courseId;
		name = courseName;
	}

	public void setNumberOfCredits(int credits){
		numberOfCredits = credits;
	}

	public void setDescription(String courseDescription){
		description = courseDescription;
	}

	public String getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public int getNumberOfCredits(){
		return numberOfCredits;
	}

	public String getDescription(){
		return description;
	}

	public String toString(){
		return "id: " + id + "\nname: " + name + "\nnum of credits: " + numberOfCredits + "\ndescription: " + description;
	}

	public Section createSection(String semester, String place, String daysAndTimes){
		return new Section(this, semester, place, daysAndTimes);
	}
}
