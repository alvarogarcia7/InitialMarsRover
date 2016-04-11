package com.dodevjutsu.kata.marsrover;

public class MarsRover {
    private Point point;
    private String direction;
    private Direction directionType;

    public MarsRover(int x, int y, String direction) {
        this(new Point(x, y), direction);
    }

    public MarsRover(Point point, String direction) {
        this.setPoint(point);
        this.setDirection(direction);
    }


    public MarsRover receive(String commands) {
        if (commands.equals("b")) {
            setPoint(getPoint().decreaseY());
        } else if (commands.equals("f")){
            setPoint(getPoint().increaseY());
        } else if (commands.equals("l")) {
            this.setDirection("W");
        } else if (commands.equals("r")) {
            this.setDirection("E");
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

        if (getPoint() != null ? !getPoint().equals(marsRover.getPoint()) : marsRover.getPoint() != null) return false;
        return getDirection() != null ? getDirection().equals(marsRover.getDirection()) : marsRover.getDirection() == null;

    }

    @Override
    public int hashCode() {
        int result = getPoint() != null ? getPoint().hashCode() : 0;
        result = 31 * result + (getDirection() != null ? getDirection().hashCode() : 0);
        return result;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
        this.directionType = Direction.from(direction);
    }
}
