package mainPackage.model;

import mainPackage.controller.OperationsDesk;
import mainPackage.model.mediaItems.MediaItem;

import java.util.LinkedList;

public class User {

    public LinkedList<MediaItem> rentedItems;

    protected OperationsDesk accessToDesk;

    public User(OperationsDesk accessToDesk) {

        rentedItems = new LinkedList<MediaItem>();
        this.accessToDesk = accessToDesk;
    }

    private void preview() {}

    private void rent() {}

    private void checkAvailable() {}

}
