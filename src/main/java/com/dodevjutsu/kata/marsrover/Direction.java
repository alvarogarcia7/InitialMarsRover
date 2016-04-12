package com.dodevjutsu.kata.marsrover;

public class Direction {
    private final String value;

    public Direction(String value) {
        this.value = value;
    }

    public static Direction create(String value) {
        return new Direction(value);
    }

    public Coordinates moveForward(Coordinates coordinates) {
        if (value.equals("N")) {
            return coordinates.add(Coordinates.at(0, 1));
        } else if (value.equals("E")) {
            return coordinates.add(Coordinates.at(1, 0));
        } else if (value.equals("S")) {
            return coordinates.add(Coordinates.at(0, -1));
        } else if (value.equals("W")) {
            return coordinates.add(Coordinates.at(-1, 0));
        }
        return null;
    }

    public Coordinates moveBackward(Coordinates coordinates) {
        if (value.equals("N")) {
            return coordinates.add(Coordinates.at(0, -1));
        } else {
            return coordinates.add(Coordinates.at(-1, 0));
        }
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Direction{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
