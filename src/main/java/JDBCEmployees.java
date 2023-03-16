import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


//import java.*;

public class JDBCEmployees {

    private Connection connection;


    public static void main(String[] args) {

        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUser(),
                    Config.getPass()
        );

            Statement stmt = connection.createStatement();

            //Store the SQL line to a String
            String query = "select * from employees LIMIT 10";

            //rs holds the result set object, executeQuery parses the SQL line "query"
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()){
                String employee = rs.getString("first_name");
                System.out.println(employee);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        //Get data from SQL
//        ArrayList<Contact>contacts = new ArrayList<>();
//        //Adds sql data into the contacts array then run this inside the servelet

//        public List<Contact> all() {
//            try {
//                Statement stmt = connection.createStatement();
//                ResultSet rs = stmt.executeQuery("select * from employees LIMIT 10");

//                while (rs.next()){
//                   Contact contact = new Contact(
//                           rs.getString("name"),
//                           rs.getString("phonenumber")
//                   );
//                   contacts.add(contact);
//                }
//            }catch (SQLException){
//                throw new RuntimeException();
//            }
//        }


    }
}
