package com.dodevjutsu.kata.marsrover;

public class MarsRover {
    private Direction direction;
    private Coordinates coordinates;

    public MarsRover(int x, int y, String direction) {
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
        if (direction.value().equals("N")) {
            coordinates = coordinates.add(Coordinates.at(0, -1));
        } else {
            coordinates = coordinates.add(Coordinates.at(-1, 0));
        }
    }

    private void moveForward() {
        if (direction.value().equals("N")) {
            coordinates = coordinates.add(Coordinates.at(0, 1));
        } else if (direction.value().equals("E")) {
            coordinates = coordinates.add(Coordinates.at(1, 0));
        } else if (direction.value().equals("S")) {
            coordinates = coordinates.add(Coordinates.at(0, -1));
        } else if (direction.value().equals("W")) {
            coordinates = coordinates.add(Coordinates.at(-1, 0));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarsRover rover = (MarsRover) o;

        if (direction.value() != null ? !direction.value().equals(rover.direction.value()) : rover.direction.value() != null) return false;
        return coordinates != null ? coordinates.equals(rover.coordinates) : rover.coordinates == null;

    }

    @Override
    public int hashCode() {
        int result = direction.value() != null ? direction.value().hashCode() : 0;
        result = 31 * result + (coordinates != null ? coordinates.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MarsRover{");
        sb.append("direction='").append(direction.value()).append('\'');
        sb.append(", coordinates=").append(coordinates);
        sb.append('}');
        return sb.toString();
    }

}
