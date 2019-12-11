package designpattern.brige.example2;

public abstract class Vehicle {

    private Workshop workshop;
    private Workshop workshop1;

    public Vehicle(Workshop workshop, Workshop workshop1) {
        this.workshop = workshop;
        this.workshop1 = workshop1;
    }
}
