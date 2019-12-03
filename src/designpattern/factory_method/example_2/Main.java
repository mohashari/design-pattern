package designpattern.factory_method.example_2;

public class Main {
    public static void main(String[] args) {

        // TODO: 03/12/19 problem : terlalu banyak menggunakan class implementasi dari animal
        Cat cat = new Cat();
        Chicken chicken = new Chicken();
        Eagle eagle = new Eagle();
        Shark shark = new Shark();
    }
}
