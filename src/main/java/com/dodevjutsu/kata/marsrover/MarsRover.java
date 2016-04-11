package com.dodevjutsu.kata.marsrover;

public class MarsRover {
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.y = y;
        this.direction = direction;
    }

    public MarsRover receive(String commands) {
        if (commands.equals("b")) {
            this.y--;
        } else if (commands.equals("f")){
            this.y++;
        } else if (commands.equals("l")) {
            this.direction = "W";
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

        if (y != marsRover.y) return false;
        return direction != null ? direction.equals(marsRover.direction) : marsRover.direction == null;

    }

    @Override
    public int hashCode() {
        int result = y;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }
}
