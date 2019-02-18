package mainPackage.model.mediaItems;

import mainPackage.model.interFaces.ListenAble;
import mainPackage.model.interFaces.WatchAble;

public class Movie extends MediaItem implements WatchAble, ListenAble {

    private int movieField;

    @Override
    public void watchMe() {

    }

    @Override
    public void listenToMe() {

    }

    public Movie(String id, String author, int releaseDate) {
        super(id, author, releaseDate);
    }
}
