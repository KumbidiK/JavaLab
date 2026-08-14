class Student {
    String name;
    int rollNo;
    double mark;

    Student() {
        name = "Unknown";
        rollNo = 0;
        mark = 0;
    }

    Student(String name, int rollNo, double mark) {
        this.name = name;
        this.rollNo = rollNo;
        this.mark = mark;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Mark: " + mark);
    }

    void calculateGrade(int mark) {
        if (mark >= 90)
            System.out.println("Grade: A");
        else if (mark >= 75)
            System.out.println("Grade: B");
        else if (mark >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }

    void calculateGrade(double mark) {
        if (mark >= 90)
            System.out.println("Grade: A");
        else if (mark >= 75)
            System.out.println("Grade: B");
        else if (mark >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }
}

class StudentManage {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Anu", 101, 85.5);
        Student s3 = new Student("Rahul", 102, 92);

        s1.display();
        s1.calculateGrade(45);

        s2.display();
        s2.calculateGrade(85.5);

        s3.display();
        s3.calculateGrade(92);
    }
}
