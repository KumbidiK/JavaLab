class Employee {
    String name;
    int id;
    double salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class EmployeeDetails {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.name = "Vishnu";
        e1.id = 101;
        e1.salary = 25000;

        e2.name = "Sahal";
        e2.id = 102;
        e2.salary = 30000;

        e3.name = "Naveen";
        e3.id = 103;
        e3.salary = 35000;

        e1.display();
        e2.display();
        e3.display();
    }
}
