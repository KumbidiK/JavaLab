import java.sql.*;

class ResultSetMetadata {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "jdbcuser";
        String password = "Achu@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection(url, user, password);

            Statement st =
                con.createStatement();

            ResultSet rs =
                st.executeQuery(
                    "SELECT * FROM student2"
                );

            ResultSetMetaData md =
                rs.getMetaData();

            int count =
                md.getColumnCount();

            System.out.println(
                "Number of Columns: " + count
            );

            for (int i = 1; i <= count; i++) {

                System.out.println(
                    "\nColumn: "
                    + md.getColumnName(i)
                );

                System.out.println(
                    "Data Type: "
                    + md.getColumnTypeName(i)
                );

                System.out.println(
                    "Size: "
                    + md.getColumnDisplaySize(i)
                );
            }

            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}