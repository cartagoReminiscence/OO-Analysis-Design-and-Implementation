public class Principal {
	public static void main(String[] args){
		//Student abraham = new Student();
		//Student abraham = new Student("Abraham");
		Student abraham = new Student("Abraham", "Los angeles, 507");

		Course aCourse = new Course();
		abraham.addCourse(aCourse);
		abraham.assignGrade(aCourse, 'C');
		System.out.println(abraham.getGPA());
	}
}
