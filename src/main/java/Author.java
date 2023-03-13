
import java.util.ArrayList;

public class Author {
    private String name;

    private ArrayList<Quotes> quotes;

    public Author(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Quotes> getQuotes() {
        return quotes;
    }

    public void setQuotes(ArrayList<Quotes> quotes) {

        this.quotes = quotes;
    }
}
