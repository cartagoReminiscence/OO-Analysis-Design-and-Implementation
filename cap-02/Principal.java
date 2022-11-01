public class Principal {
	public static void main(String[] args){
		Student abraham = new Student();
		abraham.setName("Abraham");
		//System.out.println("name: " + abraham.getName());

		Course aCourse = new Course();
		abraham.addCourse(aCourse);
		abraham.assignGrade(aCourse, 'C');
		System.out.println(abraham.getGPA());
	}
}
