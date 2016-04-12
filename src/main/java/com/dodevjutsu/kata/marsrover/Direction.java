package com.dodevjutsu.kata.marsrover;

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
}
