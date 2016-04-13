package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RoverTest {
    Rover rover;

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

    @Test
    public void rotateLeftWhenFacingWest() {
        rover = roverLandedFacing("W");

        rover.execute("l");

        assertEquals(roverLandedFacing("S"), rover);
    }

    @Test
    public void rotateLeftWhenFacingEast() {
        rover = roverLandedFacing("E");

        rover.execute("l");

        assertEquals(roverLandedFacing("N"), rover);
    }

    private Rover roverLandedFacing(String direction) {
        return new Rover(1, 2, direction);
    }
}