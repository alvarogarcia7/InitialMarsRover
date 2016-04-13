package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RoverTest {
    Rover rover;

    private Rover roverLandedFacing(String direction) {
        return new Rover(1, 2, direction);
    }

    @Test
    public void ReceiveEmptySequence(){
        rover = roverLandedFacing("N");

        rover.execute("");

        assertEquals(roverLandedFacing("N"), rover);
    }

    @Test
    public void rotateLeftWhenFacingNorth(){
        rover = roverLandedFacing("N");

        rover.execute("l");

        assertEquals(roverLandedFacing("W"), rover);
    }

    @Test
    public void rotateLeftWhenFacingSouth() {
        rover = roverLandedFacing("S");

        rover.execute("l");

        assertEquals(roverLandedFacing("E"), rover);
    }
}