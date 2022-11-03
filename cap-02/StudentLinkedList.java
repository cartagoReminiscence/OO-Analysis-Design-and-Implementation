public class StudentLinkedList implements StudentList {
    private StudentNode head;
    private class StudentNode{
        private Student data;
        private StudentNode next;
        public StudentNode(Student student, StudentNode initialLink) {
            this.data = student;
            next = initialLink;
        }
        public Student getData() {
            return data;
        }
        public void setData(Student student) {
            this.data = student;
        }
        public StudentNode getNext() {
            return next;
        }
        public void setNext(StudentNode node) {
            next = node;
        }
    }
    public void add(Student student) {
        head = new StudentNode(student, head);
    }
    public void delete(String studentName) {
        if (head == null) {
            return;
        }

        if(head.getData().getName().equals(studentName)) {
            head = head.getNext();
            return;
        }
        for(StudentNode temp = head.getNext(), previous = head;temp != null; previous = temp, temp = temp.getNext()) {
            if(temp.getData().getName().equals(studentName)) {
                previous.setNext(temp.getNext());
                return;
            }
        }
    }
    public void print() {
        System.out.println("List: ");
        for(StudentNode temp = head; temp != null; temp = temp.getNext()) {
            System.out.println(temp.getData() + " ");
        }
        System.out.println();
    }
}