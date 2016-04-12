package com.dodevjutsu.kata.marsrover;

public class North extends Direction {
    public North(String value) {
        super(value);
    }

    @Override
    public Coordinates moveForward(Coordinates coordinates) {
        return coordinates.add(Coordinates.at(0, 1));
    }

    @Override
    public Coordinates moveBackward(Coordinates coordinates) {
        return coordinates.add(Coordinates.at(0, -1));
    }
}
