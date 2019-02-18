package mainPackage.model.mediaItems;

import mainPackage.model.interFaces.ReadAble;


public class Book extends MediaItem implements ReadAble {

    private int bookField;

    @Override
    public void readMe() {

    }

    public Book(String id, String author, int releaseDate) {
        super(id, author, releaseDate);
    }
}
