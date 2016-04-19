package com.dodevjutsu.kata.marsrover;

public class WrappingWorld extends World {
    private final int height;
    private final int width;

    public WrappingWorld(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public Coordinates apply(int x, int y) {
        final int newX = x % width;
        final int newY = y % height;
        return new Coordinates(newX, newY);
    }
}
