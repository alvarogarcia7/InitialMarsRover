package com.dodevjutsu.kata.marsrover;

public class MarsRover {
    private Direction direction;
    private Coordinates coordinates;

    public MarsRover(int x, int y, String direction, World world) {
        this.coordinates = Coordinates.at(x, y);
        this.direction = Direction.create(direction);
    }


    public void receive(String commandSequence) {
        if (commandSequence.equals("f")) {
            moveForward();
        } else if (commandSequence.equals("b")) {
            moveBackward();
        }

    }

    private void moveBackward() {
        coordinates = direction.moveBackward(coordinates);
    }

    private void moveForward() {
        coordinates = direction.moveForward(coordinates);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarsRover rover = (MarsRover) o;

        if (direction != null ? !direction.equals(rover.direction) : rover.direction != null) return false;
        return coordinates != null ? coordinates.equals(rover.coordinates) : rover.coordinates == null;

    }

    @Override
    public int hashCode() {
        int result = direction != null ? direction.hashCode() : 0;
        result = 31 * result + (coordinates != null ? coordinates.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MarsRover{");
        sb.append("direction=").append(direction);
        sb.append(", coordinates=").append(coordinates);
        sb.append('}');
        return sb.toString();
    }
}
