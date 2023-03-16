import java.util.ArrayList;

public interface Ads {
    // get a list of all the ads
    ArrayList<Ad> all();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);
}
