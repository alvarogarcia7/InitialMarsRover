package com.dodevjutsu.kata.marsrover;

public class InfiniteWorld extends World {
    @Override
    public Coordinates apply(Coordinates.CoordinatesData coordinates) {
        return Coordinates.from(coordinates);
    }
}
