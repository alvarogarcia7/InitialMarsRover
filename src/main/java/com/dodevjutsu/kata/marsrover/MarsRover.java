package com.dodevjutsu.kata.marsrover;

public class MarsRover {
    private Point point;
    private Direction direction;
    private final CommandParser splitter;

    public MarsRover(Point point, Direction direction, CommandParser splitter) {
        this.point = point;
        this.direction = direction;
        this.splitter = splitter;
    }

    public MarsRover receive(String commandsRepresentation) {
        for (Command current : splitter.split(commandsRepresentation).values()) {
            String command = current.value();
            if (command.equals("b")) {
                point = point.add(direction.backward());
            } else if (command.equals("f")) {
                point = point.add(direction.forward());
            } else if (command.equals("l")) {
                this.direction = direction.left();
            } else if (command.equals("r")) {
                direction = direction.right();
            } else {
                throw new RuntimeException("this command is not known");
            }
        }
        ;

        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarsRover marsRover = (MarsRover) o;

        if (point != null ? !point.equals(marsRover.point) : marsRover.point != null) return false;
        return direction != null ? direction.equals(marsRover.direction) : marsRover.direction == null;

    }

    @Override
    public int hashCode() {
        int result = point != null ? point.hashCode() : 0;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }
}
