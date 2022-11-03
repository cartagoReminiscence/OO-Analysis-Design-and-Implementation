public class Principal {
	public static void main(String[] args){
		Course cs220 = new Course("CS 220", "Algorithms II");
		cs220.setDescription("Advanced course of algorithms and data-structures handling");
		cs220.setNumberOfCredits(10);
		Section cs220Section1 = cs220.createSection("Spring 2022", "Lecture Hall 106", "M W 4-6:05");
		//System.out.println(cs220Section1);

		//
		StudentList sl = new StudentLinkedList();//
		Student student;
		student = new Student("Bob", "Taurus Street");
		sl.add(student);
		student = new Student("Martin", "St. Anna avenue");
		sl.add(student);
		student = new Student("Anna", "George Harrys st.");
		sl.add(student);
		student = new Student("Joel", "Hall park");
		sl.add(student);
		student = new Student("Martin", "St. Anna avenue");
		sl.add(student);
		student = new Student("Joel", "Hall park");
		sl.add(student);
		sl.print();
		System.out.println("----------------");
		sl.delete("Anna");
		sl.print();
	}
}
