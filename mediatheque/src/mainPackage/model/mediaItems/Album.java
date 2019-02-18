package mainPackage.model.mediaItems;

import mainPackage.model.interFaces.ListenAble;

public class Album extends MediaItem implements ListenAble {

    @Override
    public void listenToMe() {

    }

    public Album(String id, String author, int releaseDate) {
        super(id, author, releaseDate);
    }
}
