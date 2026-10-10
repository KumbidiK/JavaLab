import java.sql.*;

class DatabaseMetadata {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "jdbcuser";
        String password = "Achu@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection(url, user, password);

            DatabaseMetaData md =
                con.getMetaData();

            System.out.println(
                "Database Name: "
                + md.getDatabaseProductName()
            );

            System.out.println(
                "Database Version: "
                + md.getDatabaseProductVersion()
            );

            System.out.println(
                "Driver Name: "
                + md.getDriverName()
            );

            System.out.println(
                "Driver Version: "
                + md.getDriverVersion()
            );

            System.out.println(
                "Max Connections: "
                + md.getMaxConnections()
            );

            System.out.println("\nTables:");

            ResultSet rs =
                md.getTables(
                    "college",
                    null,
                    "%",
                    new String[]{"TABLE"}
                );

            while (rs.next()) {
                System.out.println(
                    rs.getString("TABLE_NAME")
                );
            }

            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}