import java.sql.*;

class StudentCrud {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "jdbcuser";
        String password = "Achu@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();

            st.executeUpdate(
                "CREATE TABLE IF NOT EXISTS student " +
                "(id INT PRIMARY KEY, name VARCHAR(30), mark DOUBLE)"
            );

            
            st.executeUpdate(
                "INSERT INTO student VALUES (101, 'Naveen', 85.5)"
            );

            System.out.println("Record inserted");

            
            st.executeUpdate(
                "UPDATE student SET mark = 90 WHERE id = 101"
            );

            System.out.println("Record updated");

            
            ResultSet rs =
                st.executeQuery("SELECT * FROM student");

            System.out.println("\nStudent Details");

            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id")
                    + " Name: " + rs.getString("name")
                    + " Mark: " + rs.getDouble("mark")
                );
            }

            
            st.executeUpdate(
                "DELETE FROM student WHERE id = 101"
            );

            System.out.println("\nRecord deleted");

            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}