package com.dodevjutsu.kata.marsrover;

public class InfiniteWorld extends World {
    @Override
    public Coordinates apply(int x, int y) {
        return new Coordinates(x, y);
    }
}
