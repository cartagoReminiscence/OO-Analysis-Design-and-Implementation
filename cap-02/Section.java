class Section{
	private String semester;
	private String place;
	private String daysAndTimes;
	private Course course;

	public Section(Course theCourse, String theSemester, String thePlace, String theDaysAndTimes){
		course = theCourse;
		semester = theSemester;
		place = thePlace;
		daysAndTimes = theDaysAndTimes;
	}

	public String getSemester(){
		return semester;
	}

	public String getPlace(){
		return place;
	}

	public String getDaysAndTimes(){
		return daysAndTimes;
	}

	public Course getCourse(){
		return course;
	}

	public void setPlace(String newPlace){
		place = newPlace;
	}

	public void setDaysAndTimes(String newDaysAndTimes){
		daysAndTimes = newDaysAndTimes;
	}

	public String toString(){
		return "Semester: " + semester + "\nPlace: " + place + "\nDates and Times: " + daysAndTimes + "\n------\nCourse\n------\n" + course.toString();
	}
}
