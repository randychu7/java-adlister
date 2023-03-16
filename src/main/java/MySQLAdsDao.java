import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;

public class MySQLAdsDao implements Ads{
    Config config = new Config();
    private Connection connection;

    public MySQLAdsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUser(),
                    Config.getPass()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public ArrayList<Ad> all() {
        ArrayList<Ad>newAds = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            //Store the SQL line to a String
            String query = "select * from ads";
            //rs holds the result set object, executeQuery parses the SQL line "query"
            ResultSet rs = stmt.executeQuery(query);

                while (rs.next()){
                   Ad ads = new Ad(
                           rs.getLong("user_id"),
                           rs.getString("title"),
                           rs.getString("description")
                   );
                   newAds.add(ads);
                }
            } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return newAds;
    }

    @Override
    public Long insert(Ad ad) {
        try {
            String query = "INSERT INTO ads (user_id, title, description) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setLong(1, ad.getUserId());
            stmt.setString(2, ad.getTitle());
            stmt.setString(3, ad.getDescription());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();// Creates primary key and allows us to access the primary that was created
            if (rs.next()) {
                Long id = rs.getLong(1);
                return id;
            } else {
                throw new SQLException("Failed to get auto-generated id for inserted ad");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
