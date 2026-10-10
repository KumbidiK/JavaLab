import java.sql.*;

class TransactionDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "jdbcuser";
        String password = "Achu@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection(url, user, password);

            con.setAutoCommit(false);

            try {

                Statement st =
                    con.createStatement();

                st.executeUpdate(
                    "UPDATE account " +
                    "SET balance = balance - 1000 " +
                    "WHERE id = 1"
                );

                st.executeUpdate(
                    "UPDATE account " +
                    "SET balance = balance + 1000 " +
                    "WHERE id = 2"
                );

                con.commit();

                System.out.println(
                    "Transaction completed successfully"
                );
            }
            catch (Exception e) {

                con.rollback();

                System.out.println(
                    "Transaction failed"
                );
            }

            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}