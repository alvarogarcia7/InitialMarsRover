package com.dodevjutsu.kata.marsrover;

public class North extends Direction {
    public North(String direction) {
        super(direction);
    }

    @Override
    public Direction rotateLeft() {
        return create("W");
    }
}
