package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    public void addMedia(Media media) {
        boolean existed = false;
        for (Media item : itemsInStore) {
            if (item.getTitle().equals(media.getTitle())) {
                existed = true;
                break;
            }
        }

        if (!existed) {
            itemsInStore.add(media);
            System.out.println("The disc has been added in Store.");
            System.out.println("The media has been added in Store.");
        } else {
            System.out.println("The disc is already in the store.");
            System.out.println("The media is already in the store.");
        }
    }

    public void removeMedia(Media media) {
        boolean existed = false;
        for (Media item : itemsInStore) {
            if (item.getTitle().equals(media.getTitle())) {
                itemsInStore.remove(item);
                System.out.println("The disc has been removed from Store.");
                System.out.println("The media has been removed from Store.");
                existed = true;
                break;
            }
        }

        if (!existed) {
            System.out.println("The disc is not in the store.");
            System.out.println("The media is not in the store.");
        }
    }

    public void printStore() {
        for (Media media : itemsInStore) {
            System.out.println(media.toString());
        }
    }
    public Media searchByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }
}