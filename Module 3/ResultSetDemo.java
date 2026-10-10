import java.sql.*;

class ResultSetDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "jdbcuser";
        String password = "Achu@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection(url, user, password);

            Statement st =
                con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
                );

            ResultSet rs =
                st.executeQuery("SELECT * FROM student2");

            System.out.println("Using next():");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " "
                    + rs.getString("name") + " "
                    + rs.getDouble("mark")
                );
            }

            if (rs.first()) {
                System.out.println("\nFirst Record:");
                System.out.println(
                    rs.getInt("id") + " "
                    + rs.getString("name")
                );
            }

            if (rs.last()) {
                System.out.println("\nLast Record:");
                System.out.println(
                    rs.getInt("id") + " "
                    + rs.getString("name")
                );
            }

            if (rs.previous()) {
                System.out.println("\nPrevious Record:");
                System.out.println(
                    rs.getInt("id") + " "
                    + rs.getString("name")
                );
            }

            if (rs.absolute(2)) {
                System.out.println("\nSecond Record:");
                System.out.println(
                    rs.getInt("id") + " "
                    + rs.getString("name")
                );
            }

            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}