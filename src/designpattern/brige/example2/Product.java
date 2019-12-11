package designpattern.brige.example2;

public class Product implements Workshop {
    @Override
    public void work() {
        System.out.println("Production");
    }
}
