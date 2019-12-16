package designpattern.adapater;

public class Video {
    private String title;
    private String vlogger;
    private int duration;

    public Video() {
    }

    public Video(String title, String vlogger, int duration) {
        this.title = title;
        this.vlogger = vlogger;
        this.duration = duration;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVlogger() {
        return vlogger;
    }

    public void setVlogger(String vlogger) {
        this.vlogger = vlogger;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
