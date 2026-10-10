import java.sql.*;
import java.util.*;

class PreparedStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "jdbcuser";
        String password = "Achu@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection(url, user, password);

            String create =
                "CREATE TABLE IF NOT EXISTS student2 " +
                "(id INT PRIMARY KEY, name VARCHAR(30), mark DOUBLE)";

            Statement st = con.createStatement();
            st.executeUpdate(create);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Mark: ");
            double mark = sc.nextDouble();

            String insert =
                "INSERT INTO student2 VALUES (?, ?, ?)";

            PreparedStatement ps =
                con.prepareStatement(insert);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, mark);

            ps.executeUpdate();

            System.out.println("\nStudent registered successfully");

            System.out.print("Enter ID to search: ");
            int searchId = sc.nextInt();

            String search =
                "SELECT * FROM student2 WHERE id = ?";

            PreparedStatement ps2 =
                con.prepareStatement(search);

            ps2.setInt(1, searchId);

            ResultSet rs = ps2.executeQuery();

            if (rs.next()) {
                System.out.println("\nStudent Details");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Mark: " + rs.getDouble("mark"));
            }
            else {
                System.out.println("Student not found");
            }

            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}