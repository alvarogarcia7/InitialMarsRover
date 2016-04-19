package com.dodevjutsu.kata.marsrover;

public class WrappingWorld extends World {
    private final int height;
    private final int width;

    public WrappingWorld(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public Coordinates apply(Coordinates.CoordinatesData coordinates) {
        final int newX = coordinates.x() % width;
        final int newY = coordinates.y() % height;
        return Coordinates.at(newX, newY);
    }
}
