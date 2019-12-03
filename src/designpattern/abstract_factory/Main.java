package designpattern.abstract_factory;

public class Main {

    public static void main(String[] args) {

        Game gameEasy = new Game(new GameFactoryEasy());
        gameEasy.start();


        Game gameMedium = new Game(new GameFactoryMedium());
        gameMedium.start();


        Game gameHard = new Game(new GameFactoryHard());
        gameHard.start();
    }
}
