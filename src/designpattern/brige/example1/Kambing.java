package designpattern.brige.example1;

public class Kambing implements Binatang {

    @Override
    public boolean hidupDiDarat() {
        return true;
    }

    @Override
    public boolean hiidupDiAir() {
        return false;
    }

    @Override
    public String getName() {
        return "Kambing";
    }
}
