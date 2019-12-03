package designpattern.abstract_factory;

public class Main {

    public static void main(String[] args) {


        // TODO: 03/12/19 problem ketika 2 parameter harus sama maka rawan akan kesalahan
        Game gameEasy = new Game( new LevelEasy(),new ArenaEasy());
        gameEasy.start();


        Game gameMedium = new Game( new LevelMedium(),new ArenaMedium());
        gameMedium.start();


        Game gameHard = new Game( new LevelHard(),new ArenaHard());
        gameHard.start();
    }
}
