interface Printable {
    void print();
}

class Student implements Printable {
    String name = "Vishnu";
    int rollNo = 67;

    @Override
    public void print() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class Teacher implements Printable {
    String name = "Sahal";
    String subject = "Python";

    @Override
    public void print() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

public class StudentInterface {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        student.print();
        System.out.println();

        teacher.print();
    }
}
