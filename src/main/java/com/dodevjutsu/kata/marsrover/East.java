package com.dodevjutsu.kata.marsrover;

public class East extends Direction {
    public East(String value) {
        super(value);
    }

    @Override
    public Coordinates moveForward(Coordinates coordinates) {
        return coordinates.add(Coordinates.at(1, 0));
    }
}
