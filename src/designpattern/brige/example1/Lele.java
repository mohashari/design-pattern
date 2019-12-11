package designpattern.brige.example1;

public class Lele implements Binatang {
    @Override
    public boolean hidupDiDarat() {
        return false;
    }

    @Override
    public boolean hiidupDiAir() {
        return true;
    }

    @Override
    public String getName() {
        return "Lele";
    }
}
