package mainPackage.model;

import mainPackage.controller.OperationsDesk;
import mainPackage.model.mediaItems.MediaItem;

public class Manager extends User {


    Manager(OperationsDesk accessToDesk) {
        super(accessToDesk);
    }

    void addToLibrary(MediaItem item) {
        accessToDesk.addItem(item);
    }

    void removeFromLibrary(String id) {
        accessToDesk.removeItem(id);

    }

    public void editMetadata(String id, String newAuthor, int newReleaseDate) {
        accessToDesk.editMetadata(id, newAuthor, newReleaseDate);
    }
}
