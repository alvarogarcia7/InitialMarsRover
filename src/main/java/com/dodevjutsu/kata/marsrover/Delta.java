package com.dodevjutsu.kata.marsrover;

public class Delta {
    private final int x;
    private final int y;

    public Delta(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Delta none() {
        return new Delta(0, 0);
    }

    public static Delta from(int x, int y) {
        return new Delta(x, y);
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Delta delta = (Delta) o;

        if (x != delta.x) return false;
        return y == delta.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
