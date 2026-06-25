import java.sql.*;

public class Scenario2 {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/preethi",
                "root",
                "12345678"
            );

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                "SELECT CustomerID, Balance FROM Customers"
            );

            while(rs.next()) {

                int id = rs.getInt("CustomerID");
                double bal = rs.getDouble("Balance");

                if(bal > 10000) {

                    PreparedStatement ps = con.prepareStatement(
                        "UPDATE Customers SET IsVIP='TRUE' WHERE CustomerID=?"
                    );

                    ps.setInt(1, id);
                    ps.executeUpdate();
                }
            }

            System.out.println("Scenario 2 Completed");
            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}