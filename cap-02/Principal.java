public class Principal {
	public static void main(String[] args){
		//Student abraham = new Student();
		//Student abraham = new Student("Abraham");
		Student abraham = new Student("Abraham", "Los angeles  - 507");
		System.out.println(abraham);

		Course aCourse = new Course();
		abraham.addCourse(aCourse);
		abraham.assignGrade(aCourse, 'C');
		System.out.println(abraham.getGPA());

		Student.setMinimumGPA(0.65);//<class_name>.<method_name>
		System.out.println("minimumGPA:" + Student.getMinimumGPA());
	}
}
