package com.dodevjutsu.kata.marsrover;

import javax.jws.soap.InitParam;

public class Direction {
    private final String value;

    public Direction(String value) {
        this.value = value;
    }

    public static Direction create(String value) {
        return new Direction(value);
    }

    public String value() {
        return value;
    }

    public Coordinates moveForward(Coordinates coordinates) {
        if (this.value().equals("N")) {
            return coordinates.add(Coordinates.at(0, 1));
        } else if (this.value().equals("E")) {
            return coordinates.add(Coordinates.at(1, 0));
        } else if (this.value().equals("S")) {
            return coordinates.add(Coordinates.at(0, -1));
        } else if (this.value().equals("W")) {
            return coordinates.add(Coordinates.at(-1, 0));
        }
        return null;
    }

    public Coordinates moveBackward(Coordinates coordinates) {
        if (this.value().equals("N")) {
            return coordinates.add(Coordinates.at(0, -1));
        } else {
            return coordinates.add(Coordinates.at(-1, 0));
        }
    }
}
