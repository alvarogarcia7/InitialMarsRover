package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {
    Rover rover;

    public Rover createRover(int x, int y, String direction){
        return new Rover(x, y, direction);
    }

    @Test
    public void ReceiveEmptySequence(){
        rover = this.createRover(1, 2, "N");

        rover.execute("");

        assertEquals(new Rover(1, 2, "N"), rover);
    }

    @Test
    public void rotateLeftWhenFacingNorth(){
        rover = this.createRover(1, 2, "N");

        rover.execute("l");

        assertEquals(new Rover(1, 2 , "W"), rover);
    }

    @Test
    public void rotateLeftWhenFacingSouth() {
        rover = this.createRover(1, 2, "S");

        rover.execute("l");

        assertEquals(new Rover(1, 2, "E"), rover);
    }
}