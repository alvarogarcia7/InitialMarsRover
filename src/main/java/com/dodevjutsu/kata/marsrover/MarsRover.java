package com.dodevjutsu.kata.marsrover;

public class MarsRover {
    private Point point;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this(new Point(x, y), direction);
    }

    public MarsRover(Point point, String direction) {
        this.point = point;
        this.direction = direction;
    }


    public MarsRover receive(String commands) {
        if (commands.equals("b")) {
            decreaseY();
        } else if (commands.equals("f")){
            increaseY();
        } else if (commands.equals("l")) {
            this.direction = "W";
        } else if (commands.equals("r")) {
            this.direction = "E";
        } else {
            throw new RuntimeException("this command is not known");
        }

        return this;
    }

    private void increaseY() {
        this.setY(this.getY() + 1);
    }

    private void decreaseY() {
        this.setY(this.getY() - 1);
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

    public int getY() {
        return point.y;
    }

    public void setY(int y) {
        this.point.y = y;
    }
}
