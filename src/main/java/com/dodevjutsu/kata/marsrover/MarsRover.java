package com.dodevjutsu.kata.marsrover;

public class MarsRover {
    private Point point;
    private Direction direction;

    public MarsRover(Point point, Direction direction) {
        this.point = point;
        this.direction = direction;
    }

    public MarsRover receive(String commands) {
        if (commands.equals("b")) {
            this.point = point.decreaseY();
        } else if (commands.equals("f")){
            this.point = point.increaseY();
        } else if (commands.equals("l")) {
            this.direction = direction.left();
        } else if (commands.equals("r")) {
            direction = direction.right();
        } else {
            throw new RuntimeException("this command is not known");
        }

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
