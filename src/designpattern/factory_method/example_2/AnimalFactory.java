package designpattern.factory_method.example_2;

public class AnimalFactory {


    public static Animal create(String type) {
        switch (type) {
            case "cat":
                return new Cat();
            case "chicken":
                return new Chicken();
            case "eagle":
                return new Eagle();
                case "shark":
                return new Shark();
            default:
                return null;
        }
    }
}
