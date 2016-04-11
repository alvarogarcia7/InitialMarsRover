package com.dodevjutsu.kata.marsrover;

public class Point {
    public final int x;
    public int y;

    public Point(int x, int y) {

        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    Point decreaseY() {
        this.y--;
        return this;
    }

    Point increaseY() {
        this.y++;
        return this;
    }
}