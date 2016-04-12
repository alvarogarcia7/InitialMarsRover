package com.dodevjutsu.kata.marsrover;

public class West extends Direction {
    public West(String value) {
        super(value);
    }

    @Override
    public Coordinates moveForward(Coordinates coordinates) {
        return coordinates.add(Coordinates.at(-1, 0));
    }
}
