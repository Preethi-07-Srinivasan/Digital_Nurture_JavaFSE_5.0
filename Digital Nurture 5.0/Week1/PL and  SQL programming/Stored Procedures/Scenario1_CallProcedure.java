import java.sql.*;

public class Scenario1_CallProcedure {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/preethi",
                "root",
                "12345678"
            );

            CallableStatement cs = con.prepareCall("{CALL ProcessMonthlyInterest()}");

            cs.execute();

            System.out.println("Monthly Interest Applied Successfully!");

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}