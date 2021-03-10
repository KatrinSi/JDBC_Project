import java.sql.*;

public class TestConnection {
    public static void main(String[] args) {

        //34.207.227.115
        //1521
        //XE
        //hr
        //hr

        //1.
        String URL = "jdbc:oracle:thin:@34.207.227.115:1521:XE";
        try {
            Connection connection = DriverManager.getConnection(URL, "hr", "hr");
            System.out.println("Connection is successful");
        }catch (SQLException e){
            System.out.println("Connection failed. "+e.getMessage());
        }

        //2.


    }
}
