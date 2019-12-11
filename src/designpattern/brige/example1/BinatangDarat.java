package designpattern.brige.example1;

public abstract class BinatangDarat implements Binatang {

    @Override
    public boolean hidupDiDarat() {
        return true;
    }

    @Override
    public boolean hidupDiAir() {
        return false;
    }


    abstract int getJumlahKaki();
}
