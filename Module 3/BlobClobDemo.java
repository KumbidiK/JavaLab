import java.sql.*;
import java.io.*;

class BlobClobDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "jdbcuser";
        String password = "Achu@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection(url, user, password);

            FileInputStream image =
                new FileInputStream("image.jpg");

            FileReader document =
                new FileReader("document.txt");

            String sql =
                "INSERT INTO files VALUES (?, ?, ?)";

            PreparedStatement ps =
                con.prepareStatement(sql);

            ps.setInt(1, 1);
            ps.setBinaryStream(2, image);
            ps.setCharacterStream(3, document);

            ps.executeUpdate();

            System.out.println("Image and document stored");

            image.close();
            document.close();

            Statement st = con.createStatement();

            ResultSet rs =
                st.executeQuery(
                    "SELECT image, document FROM files WHERE id = 1"
                );

            if (rs.next()) {

                Blob blob = rs.getBlob("image");
                Clob clob = rs.getClob("document");

                InputStream in =
                    blob.getBinaryStream();

                FileOutputStream out =
                    new FileOutputStream("output.jpg");

                int ch;

                while ((ch = in.read()) != -1) {
                    out.write(ch);
                }

                Reader reader =
                    clob.getCharacterStream();

                FileWriter writer =
                    new FileWriter("output.txt");

                while ((ch = reader.read()) != -1) {
                    writer.write(ch);
                }

                in.close();
                out.close();
                reader.close();
                writer.close();

                System.out.println(
                    "Image and document retrieved"
                );
            }

            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}