import java.sql.*;
import java.util.*;

class JDBCException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "jdbcuser";
        String password = "Achu@123";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection(
                    url, user, password
                );

            System.out.print("Enter Student ID: ");

            int id = sc.nextInt();

            Statement st =
                con.createStatement();

            try {

                ResultSet rs =
                    st.executeQuery(
                        "SELECT * FROM student2 " +
                        "WHERE id = " + id
                    );

                if (rs.next()) {

                    System.out.println(
                        "ID: " + rs.getInt("id")
                    );

                    System.out.println(
                        "Name: "
                        + rs.getString("name")
                    );

                    System.out.println(
                        "Mark: "
                        + rs.getDouble("mark")
                    );
                }
                else {
                    System.out.println(
                        "Student not found"
                    );
                }
            }
            catch (SQLException e) {

                System.out.println(
                    "SQL Error: " + e.getMessage()
                );
            }

            con.close();
        }
        catch (ClassNotFoundException e) {

            System.out.println(
                "JDBC Driver not found"
            );
        }
        catch (SQLException e) {

            System.out.println(
                "Database connection error: "
                + e.getMessage()
            );
        }
        catch (InputMismatchException e) {

            System.out.println(
                "Invalid input"
            );
        }
    }
}