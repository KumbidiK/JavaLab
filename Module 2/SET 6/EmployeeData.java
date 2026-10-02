import java.io.*;
import java.util.*;

class EmployeeData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            DataOutputStream out =
                new DataOutputStream(
                    new FileOutputStream("employee.dat"));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            out.writeInt(id);
            out.writeUTF(name);
            out.writeDouble(salary);

            out.close();

            DataInputStream in =
                new DataInputStream(
                    new FileInputStream("employee.dat"));

            System.out.println("\nEmployee Details");
            System.out.println("ID: " + in.readInt());
            System.out.println("Name: " + in.readUTF());
            System.out.println("Salary: " + in.readDouble());

            in.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}