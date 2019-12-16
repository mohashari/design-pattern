package designpattern.brige.example1;

public class Kambing extends BinatangDarat {

    @Override
    public String getName() {
        return "Kambing";
    }

    @Override
    int getJumlahKaki() {
        return 4;
    }
}
