class Student {
    String name;
    int rollNo;
    double mark;
}

class StudentDetails {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Vishnu";
        s.rollNo = 67;
        s.mark = 85.5;

        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.rollNo);
        System.out.println("Mark: " + s.mark);
    }
}
