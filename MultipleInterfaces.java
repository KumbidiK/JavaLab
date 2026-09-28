interface Sports {
    void showSports();
}

interface Academics {
    void showAcademics();
}

class Student implements Sports, Academics {

    public void showSports() {
        System.out.println("Sports: Cricket");
    }

    public void showAcademics() {
        System.out.println("Academics: Computer Science");
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        Student student = new Student();

        student.showAcademics();
        student.showSports();
    }
}
