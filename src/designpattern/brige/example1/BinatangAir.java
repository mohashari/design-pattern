package designpattern.brige.example1;

public abstract class BinatangAir implements Binatang {
    @Override
    public boolean hidupDiDarat() {
        return false;
    }

    @Override
    public boolean hidupDiAir() {
        return true;
    }


}
