package com.dodevjutsu.kata.marsrover;

public class Rover {

    private final int x;
    private final int y;
    private Direction direction;

    public Rover(int x, int y, String value) {
        this.x = x;
        this.y = y;
        this.direction = Direction.create(value);
    }

    public void execute(String sequence) {
        if (sequence.equals("l")) {
            rotateLeft();
        }
    }

    private void rotateLeft() {
        this.direction = this.direction.rotateLeft();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        if (x != rover.x) return false;
        if (y != rover.y) return false;
        return direction != null ? direction.equals(rover.direction) : rover.direction == null;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rover{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", direction=").append(direction);
        sb.append('}');
        return sb.toString();
    }
}
