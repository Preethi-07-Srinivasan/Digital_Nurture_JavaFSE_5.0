import java.sql.*;

public class Scenario3_CallProcedure {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/preethi",
                "root",
                "12345678"
            );

            CallableStatement cs = con.prepareCall(
                "{CALL TransferFunds(?, ?, ?)}"
            );

            cs.setInt(1, 1);       
            cs.setInt(2, 2);      
            cs.setDouble(3, 2000); 

            boolean hasResult = cs.execute();

            if(hasResult) {
                ResultSet rs = cs.getResultSet();

                while(rs.next()) {
                    System.out.println(rs.getString(1));
                }
            } else {
                System.out.println("Transfer executed successfully!");
            }

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}