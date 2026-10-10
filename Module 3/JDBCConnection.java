import java.sql.*;

class JDBCConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "jdbcuser";
        String password = "Achu@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection(url, user, password);

            System.out.println("Database connected successfully");

            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}