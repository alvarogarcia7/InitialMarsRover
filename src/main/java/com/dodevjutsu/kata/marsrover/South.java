package com.dodevjutsu.kata.marsrover;

public class South extends Direction {
    public South(String value) {
        super(value);
    }

    @Override
    public Coordinates moveForward(Coordinates coordinates) {
        return coordinates.add(Coordinates.at(0, -1));
    }
}
