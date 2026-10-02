import java.io.*;

class StudentData {
    public static void main(String[] args) {
        try {
            DataOutputStream out =
                new DataOutputStream(
                    new FileOutputStream("student.dat"));

            out.writeInt(101);
            out.writeUTF("Naveen");
            out.writeDouble(85.5);

            out.close();

            DataInputStream in =
                new DataInputStream(
                    new FileInputStream("student.dat"));

            System.out.println("Roll No: " + in.readInt());
            System.out.println("Name: " + in.readUTF());
            System.out.println("Marks: " + in.readDouble());

            in.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}