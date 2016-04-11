package com.dodevjutsu.kata.marsrover;

public class MarsRover {
    private Point point;
    private Direction directionType;

    public MarsRover(Point point, String direction) {
        this.setPoint(point);
        this.directionType = Direction.from(direction);
    }

    public MarsRover receive(String commands) {
        if (commands.equals("b")) {
            setPoint(getPoint().decreaseY());
        } else if (commands.equals("f")){
            setPoint(getPoint().increaseY());
        } else if (commands.equals("l")) {
            this.directionType = Direction.from("W");
        } else if (commands.equals("r")) {
            this.directionType = Direction.from("E");
        } else {
            throw new RuntimeException("this command is not known");
        }

        return this;
    }

    public Point getPoint() {
        return point;
    }


    public void setPoint(Point point) {
        this.point = point;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarsRover marsRover = (MarsRover) o;

        if (point != null ? !point.equals(marsRover.point) : marsRover.point != null) return false;
        return directionType != null ? directionType.equals(marsRover.directionType) : marsRover.directionType == null;

    }

    @Override
    public int hashCode() {
        int result = point != null ? point.hashCode() : 0;
        result = 31 * result + (directionType != null ? directionType.hashCode() : 0);
        return result;
    }
}
