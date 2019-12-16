package designpattern.factory_method.example_2;

public class Main {
    public static void main(String[] args) {
        Cat cat = (Cat) AnimalFactory.create("cat");
        Chicken chicken = (Chicken) AnimalFactory.create("chicken");
        Eagle eagle = (Eagle) AnimalFactory.create("eagle");
        Shark shark = (Shark) AnimalFactory.create("shark");

        System.out.println("Cat Speak ");
        cat.speak();
        System.out.println("Chicken Speak ");
        chicken.speak();
        System.out.println("Eagle Speak ");
        eagle.speak();
        System.out.println("Shark Speak ");
        shark.speak();
    }
}
