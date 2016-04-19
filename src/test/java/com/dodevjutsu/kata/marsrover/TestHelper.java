package com.dodevjutsu.kata.marsrover;

public class TestHelper {
    static MarsRover marsRoverAt(int x, int y, String direction) {
        return new MarsRover(x, y, direction, new InfiniteWorld());
    }

    static MarsRover marsRoverAt(int x, int y, String direction, World world) {
        return new MarsRover(x, y, direction, world);
    }
}
