package com.dodevjutsu.kata.marsrover;

public abstract class Direction {
    private final String value;

    protected Direction(String value) {
        this.value = value;
    }

    public static Direction create(String value) {
        if ("N".equals(value)) {
            return new North(value);
        } else if ("E".equals(value)) {
            return new East(value);
        } else if ("S".equals(value)) {
            return new South(value);
        } else {
            return new West(value);
        }
    }

    public abstract Coordinates moveForward(Coordinates coordinates);

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
