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

    public Direction right() {
        if (this.equals(Direction.from("N"))) {
            return Direction.from("E");
        } else if (this.equals(Direction.from("E"))) {
            return Direction.from("S");
        } else if (this.equals(Direction.from("S"))) {
            return Direction.from("W");
        } else if (this.equals(Direction.from("W"))) {
            return Direction.from("N");
        }
        throw new RuntimeException("");
    }

    public Direction left() {
        if (this.equals(Direction.from("N"))) {
            return Direction.from("W");
        } else if (this.equals(Direction.from("E"))) {
            return Direction.from("N");
        } else if (this.equals(Direction.from("S"))) {
            return Direction.from("E");
        } else if (this.equals(Direction.from("W"))) {
            return Direction.from("S");
        }
        throw new RuntimeException("");
    }

    public Delta forward() {
        if (this.equals(Direction.from("N"))) {
            return Delta.from(0, 1);
        } else if (this.equals(Direction.from("S"))) {
            return Delta.from(0, -1);
        }
        return Delta.none();
    }

    public Delta backward() {
        if (this.equals(Direction.from("N"))) {
            return Delta.from(0, -1);
        } else if (this.equals(Direction.from("S"))) {
            return Delta.from(0, 1);
        }
        return Delta.none();
    }
}
