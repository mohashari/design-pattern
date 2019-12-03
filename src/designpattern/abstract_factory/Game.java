package designpattern.abstract_factory;

public class Game {

    private Level level;

    private Arena arena;

    public Game(GameFactory gameFactory) {
        this.level = gameFactory.createLevel();
        this.arena = gameFactory.createArena();
    }

    public Game() {

    }

    public void start() {
        this.arena.start();
        this.level.start();
    }
}
