import com.mysql.cj.jdbc.Driver;
import javax.xml.transform.Result;
import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new Driver());

            Connection connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUser(),
                    Config.getPass()
                    );

            System.out.println(connection);


            Statement stmt = connection.createStatement();

            //Store the SQL line to a String
            String query = "select * from albums";

            //rs holds the result set object, executeQuery parses the SQL line "query"
            ResultSet rs = stmt.executeQuery(query);

            //will remain true until the end of the table once it hits true it should end
//            if (rs.next()) {
//                //use get string to get the data out
//                System.out.println(rs.getString("artist"));
//
//            }
            while (rs.next()){
                String artist = rs.getString("genre");
                if (artist.contains("Rock")){
                    System.out.println(rs.getString("name"));
                }
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
