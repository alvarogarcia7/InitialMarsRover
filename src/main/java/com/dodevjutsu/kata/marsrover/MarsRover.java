package com.dodevjutsu.kata.marsrover;

public class MarsRover {
    private String direction;
    private Direction directionType;
    private Coordinates coordinates;

    public MarsRover(int x, int y, String direction) {
        this.coordinates = Coordinates.at(x, y);
        this.setDirection(direction);
    }


    public void receive(String commandSequence) {
        if (commandSequence.equals("f")) {
            moveForward();
        } else if (commandSequence.equals("b")) {
            moveBackward();
        }

    }

    private void moveBackward() {
        if (getDirection().equals("N")) {
            coordinates = coordinates.add(Coordinates.at(0, -1));
        } else {
            coordinates = coordinates.add(Coordinates.at(-1, 0));
        }
    }

    private void moveForward() {
        if (getDirection().equals("N")) {
            coordinates = coordinates.add(Coordinates.at(0, 1));
        } else if (getDirection().equals("E")) {
            coordinates = coordinates.add(Coordinates.at(1, 0));
        } else if (getDirection().equals("S")) {
            coordinates = coordinates.add(Coordinates.at(0, -1));
        } else if (getDirection().equals("W")) {
            coordinates = coordinates.add(Coordinates.at(-1, 0));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarsRover rover = (MarsRover) o;

        if (getDirection() != null ? !getDirection().equals(rover.getDirection()) : rover.getDirection() != null) return false;
        return coordinates != null ? coordinates.equals(rover.coordinates) : rover.coordinates == null;

    }

    @Override
    public int hashCode() {
        int result = getDirection() != null ? getDirection().hashCode() : 0;
        result = 31 * result + (coordinates != null ? coordinates.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MarsRover{");
        sb.append("direction='").append(getDirection()).append('\'');
        sb.append(", coordinates=").append(coordinates);
        sb.append('}');
        return sb.toString();
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.directionType = Direction.create(direction);
        this.direction = direction;
    }
}
