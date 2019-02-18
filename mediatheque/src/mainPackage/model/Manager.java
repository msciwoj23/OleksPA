package mainPackage.model;

import mainPackage.controller.OperationsDesk;
import mainPackage.model.mediaItems.MediaItem;

public class Manager extends User {


    public Manager(OperationsDesk accessToDesk) {
        super(accessToDesk);
    }

    public void addToLibrary(MediaItem item) {
        accessToDesk.addItem(item);
    }

    public void removeFromLibrary(String id) {
        accessToDesk.removeItem(id);

    }

    private void editMetadata(MediaItem item) {

    }
}
