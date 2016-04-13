package com.dodevjutsu.kata.marsrover;

public class Direction {
    private final String direction;

    private Direction(String direction) {
        this.direction = direction;
    }

    public static Direction create(String direction) {
        return new Direction(direction);
    }

    public Direction rotateLeft() {
        if (direction.equals("N")) {
            return create("W");
        } else if(direction.equals("W")) {
            return create("S");
        } else if(direction.equals("E")) {
            return create("N");
        } else {
            return create("E");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direction direction1 = (Direction) o;

        return direction != null ? direction.equals(direction1.direction) : direction1.direction == null;

    }

    @Override
    public int hashCode() {
        return direction != null ? direction.hashCode() : 0;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Direction{");
        sb.append("direction='").append(direction).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
