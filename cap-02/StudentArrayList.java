public class StudentArrayList implements StudentList {
    private Student[] students;
    private int first;
    private int count;
    private int initialCapacity;
    public StudentArrayList(int capacity) {
        students = new Student[capacity];
        initialCapacity = capacity;
    }
    public StudentArrayList() {
        this(10);
    }
    public void add(Student student) {
        if (count == students.length) {
            reallocate(count * 2);
        }
        int last = (first + count) % students.length;
        students[last] = student;
        count++;
    }
    public void delete(String name) {
        for (int index = first, counter = 0; counter < count; counter++, index = (index + 1) % students.length) {
            if (students[index].getName().equals(name)) {
                students[index] = students[(first + count - 1) % students.length];
                students[(first + count - 1) % students.length] = null;
                count--;
                return;
            }
        }
    }
    public Student get(int index) {
        if (index >= 0 && index < count) {
            return students[index];
        }
        return null;
    }
    public int size() {
        return count;
    }
    public void print() {
        for (int index = first, counter = 0; counter < count; counter++, index = (index + 1) % students.length) {
            System.out.println(students[index]);
        }
    }
    public void reallocate(int size) {
        Student[] temp = new Student[size];
        if (first + count >= students.length) {
            int count1 = students.length - first;
            int count2 = count - count1;
            System.arraycopy(students, first, temp, 0, count1);
            System.arraycopy(students, first + count1, temp, count1, count2);
        } else {
            System.arraycopy(students, first, temp, 0, count);
        }
        students = temp;
        first = 0;
    }
}