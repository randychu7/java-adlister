import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {

        Album thriller = new Album(1, "Thriller", "Michael Jackson", 1989 );
        Album darkside = new Album(2, "The Dark Side of The Moon", "AC/DC", 1978);

        ArrayList<Album> albums = new ArrayList<>(new ArrayList<>(List.of(
                thriller,darkside
        )));

        for(Album album : albums ){
            System.out.println("Title is " + album.getTitle() + " artist is " + album.getArtist() + " release date is " +album.getYear());
        }

        Author johnCena = new Author("John Cena");
        Author yoda = new Author("Yoda");

        // create a list of quotes for the author

        Quotes john1 = (new Quotes("to be or not to be", johnCena));
        Quotes yoda1 = (new Quotes("the greatest glory in living lies not in never falling, but in rising every time we fall", yoda));
        Quotes yoda2 = (new Quotes("if you set your goals ridiculously high and it's a failure, you will fail above everyone else's success", yoda));

        ArrayList<Quotes> quotes = new ArrayList<>(Arrays.asList(
                john1,
                yoda1,
                yoda2
        ));

        // iterate over the quotes and print out the content and author name
        System.out.println("Quotes:");
        for (Quotes quote : quotes) {
            System.out.println("- " + quote.getAuthor().getName() + " said " + quote.getContent());
        }
        ArrayList<Quotes> johnQuotes = new ArrayList<>(Arrays.asList(yoda1, yoda2));
        johnCena.setQuotes(johnQuotes);






    }
}
