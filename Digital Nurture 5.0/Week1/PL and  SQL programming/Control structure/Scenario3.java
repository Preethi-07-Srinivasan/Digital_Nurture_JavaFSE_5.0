import java.sql.*;

public class Scenario3 {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/preethi",
                "root",
                "12345678"
            );

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                "SELECT c.Name, l.LoanID, l.DueDate " +
                "FROM Customers c JOIN Loans l " +
                "ON c.CustomerID = l.CustomerID " +
                "WHERE l.DueDate BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL 30 DAY)"
            );

            while(rs.next()) {

                System.out.println(
                    "Reminder: Dear " + rs.getString("Name") +
                    ", Loan " + rs.getInt("LoanID") +
                    " due on " + rs.getDate("DueDate")
                );
            }

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}