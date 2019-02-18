package mainPackage.model;

import mainPackage.model.mediaItems.MediaItem;

import java.util.LinkedList;

public class Persistence {

    public LinkedList<MediaItem> itemsInTheque = new LinkedList<MediaItem>();
    public LinkedList<User> users = new LinkedList<User>();


    public void addItem(MediaItem item) {
        itemsInTheque.add(item);
    }

    public void removeItem(String itemID) {

        for (int i = 0; i < itemsInTheque.size(); i++) {
            if (itemID.equals(itemsInTheque.get(i).id)) {
                itemsInTheque.remove(i);
            }
        }

    }
}
