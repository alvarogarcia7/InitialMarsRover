package com.dodevjutsu.kata.marsrover;

public class MarsRover {
    private final String direction;
    private Coordinates coordinates;

    public MarsRover(int x, int y, String direction) {
        this.coordinates = Coordinates.at(x, y);
        this.direction = direction;
    }


    public void receive(String commandSequence) {
        if (!commandSequence.equals("f")) {
            return;
        }
        if (direction.equals("N")) {
            coordinates = coordinates.add(Coordinates.at(0, 1));
        } else if (direction.equals("E")) {
            coordinates = coordinates.add(Coordinates.at(1, 0));
        }
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
        sb.append("direction='").append(direction).append('\'');
        sb.append(", coordinates=").append(coordinates);
        sb.append('}');
        return sb.toString();
    }
}
