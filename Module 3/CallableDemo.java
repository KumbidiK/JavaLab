import java.sql.*;

class CallableDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "jdbcuser";
        String password = "Achu@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection(url, user, password);

            CallableStatement cs =
                con.prepareCall("{call getStudent(?)}");

            cs.setInt(1, 101);

            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                System.out.println("ID: "
                    + rs.getInt("id"));

                System.out.println("Name: "
                    + rs.getString("name"));

                System.out.println("Mark: "
                    + rs.getDouble("mark"));
            }

            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}