import java.sql.*;

public class Scenario1 {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/preethi",
                "root",
                "12345678"
            );

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                "SELECT CustomerID, Age FROM Customers"
            );

            while(rs.next()) {

                int id = rs.getInt("CustomerID");
                int age = rs.getInt("Age");

                if(age > 60) {

                    PreparedStatement ps = con.prepareStatement(
                        "UPDATE Loans SET InterestRate = InterestRate - 1 WHERE CustomerID=?"
                    );

                    ps.setInt(1, id);
                    ps.executeUpdate();
                }
            }

            System.out.println("Scenario 1 Completed");
            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}