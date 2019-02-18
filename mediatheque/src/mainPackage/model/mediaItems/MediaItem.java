package mainPackage.model.mediaItems;

public abstract class MediaItem {

    public String id;
    public String author;
    public int releaseDate;

    public MediaItem(String id, String author, int releaseDate) {
        this.id = id;
        this.author = author;
        this.releaseDate = releaseDate;
    }
}
