package designpattern.brige.example1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Binatang> binatangs = new LinkedList<>();

        binatangs.add(new Kambing());
        binatangs.add(new Lele());

        binatangs.forEach(binatang -> {
            if (binatang instanceof BinatangDarat) {
                System.out.println(binatang.getName() + " hidup di darat" + " dan jumlah kaki " + ((BinatangDarat) binatang).getJumlahKaki());
            } else if (binatang instanceof BinatangAir) {
                System.out.println(binatang.getName() + " hidup di air");
            }
        });
    }
}
