package designpattern.brige.example1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Binatang> binatangs = new LinkedList<>();

        binatangs.add(new Kambing());
        binatangs.add(new Lele());

        // TODO: 11/12/19 problem jika ada penambahan di action di dalam interface binatang maka akan menambah banyak kondisi didalam mengakses binatang
        binatangs.forEach(binatang -> {
            if(binatang.hidupDiDarat()){
                System.out.println(binatang.getName()+" hidup di darat");
            }else {
                System.out.println(binatang.getName()+" hidup di air");
            }
        });
    }
}
