package designpattern.brige.example2;

public class Assemble implements Workshop {

    @Override
    public void work() {
        System.out.println("Assemble ....");
    }
}
