import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class GFG {
        // Step1: Main driver method
        public static void main(String[] args) throws SQLException {
            // Step 2: Making connection using
            // Connection type and inbuilt function on
            Connection con = null;
            PreparedStatement p = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject", "root", "12345");

            // Try block to catch exception/s
            try {

                // SQL command data stored in String datatype
                String sql = "select * from menu";
                p = con.prepareStatement(sql);
                rs = p.executeQuery();

                // Printing ID, name, email of customers
                // of the SQL command above
                System.out.println("menuID\t\titem_name\t\titem_price");

                // Condition check
                while (rs.next()) {

                    String id = rs.getString("menuID");
                    String name = rs.getString("item_name");
                    String email = rs.getString("item_price");
                    System.out.println(id + "\t\t" + name
                            + "\t\t" + email);
                }
            }

            // Catch block to handle exception
            catch (SQLException e) {

                // Print exception pop-up on screen
                System.out.println(e);
            }
        }
    }
