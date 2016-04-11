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
}
