package designpattern.abstract_factory;

public class Game {

    private Level level;

    private Arena arena;

    public Game(Level level, Arena arena) {
        this.level = level;
        this.arena = arena;
    }

    public Game() {

    }

    public void start() {
        this.arena.start();
        this.level.start();
    }
}
