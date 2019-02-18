package mainPackage.model.mediaItems;

import mainPackage.model.interFaces.ReadAble;

public class Magazine extends MediaItem implements ReadAble {

    @Override
    public void readMe() {

    }

    public Magazine(String id, String author, int releaseDate) {
        super(id, author, releaseDate);
    }
}
