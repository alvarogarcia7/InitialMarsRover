package com.dodevjutsu.kata.marsrover;

import javafx.util.Builder;

public class MarsRoverBuilder implements Builder<MarsRover>{
    private Point point;
    private String direction;

    private MarsRoverBuilder() {
        this.point = new Point(0,0);
    }

    public static MarsRoverBuilder aNew() {
        return new MarsRoverBuilder();
    }

    @Override
    public MarsRover build() {
        return new MarsRover(point, direction);
    }

    public MarsRoverBuilder at(Point point) {
        this.point = point;
        return this;
    }

    public MarsRoverBuilder facing(String direction) {
        this.direction = direction;
        return this;
    }
}
