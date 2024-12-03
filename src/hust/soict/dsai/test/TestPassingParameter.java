package hust.soict.dsai.test;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;
import java.util.*;
public class TestPassingParameter{
	public static void main(String[] args) {

        List<Media> mediae = new ArrayList<Media>();
        ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("Track 1", 1));
        tracks.add(new Track("Track 2", 2));
        Media cd = new CompactDisc(7, "CD2", "Music", 10.3f, "Director 2", "Long", tracks);

        Media dvd = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);

        List<String> authors = new ArrayList<>();
        authors.add("Author 1");
        authors.add("Author 2");
        Media book = new Book(8, "Book2", "Horror", 4.5f, authors);

        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        for (Media m : mediae) {
            System.out.println(m.toString());
        }   
}

	}
