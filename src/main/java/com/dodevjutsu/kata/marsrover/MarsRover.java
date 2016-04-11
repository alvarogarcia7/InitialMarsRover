package com.dodevjutsu.kata.marsrover;

public class MarsRover {
    private int y;

    public MarsRover(int x, int y, String direction) {
        this.y = y;
    }

    public MarsRover receive(String commands) {
        if (commands.equals("b")) {
            this.y--;
        } else {
            this.y++;
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarsRover marsRover = (MarsRover) o;

        return y == marsRover.y;

    }

    @Override
    public int hashCode() {
        return y;
    }
}
