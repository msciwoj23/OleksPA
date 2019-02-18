package mainPackage.model;

import mainPackage.model.mediaItems.MediaItem;

import java.util.LinkedList;

public class User {

    public LinkedList<MediaItem> rentedItems;

    public User() {
        rentedItems = new LinkedList<MediaItem>();
    }

    private void preview() {}

    private void rent() {}

    private void checkAvailable() {}

}
