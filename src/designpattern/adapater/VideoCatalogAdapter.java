package designpattern.adapater;

public class VideoCatalogAdapter implements CatalogAdapter {

    private Video video;

    public VideoCatalogAdapter(Video video) {
        this.video = video;
    }

    @Override
    public String getCatalog() {
        return "Catalog: " + video.getTitle() + " by " + video.getVlogger();
    }
}
