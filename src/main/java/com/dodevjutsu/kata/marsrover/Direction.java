package com.dodevjutsu.kata.marsrover;

public class Direction {
    private final String value;

    public Direction(String value) {
        this.value = value;
    }

    public static Direction from(String value) {
        return new Direction(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direction direction = (Direction) o;

        return value != null ? value.equals(direction.value) : direction.value == null;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
