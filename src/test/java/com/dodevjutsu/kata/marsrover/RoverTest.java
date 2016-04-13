package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {
    @Test
    public void ReceiveEmptySequence(){
        Rover rover = new Rover(1, 2, "N");

        rover.execute("");

        assertEquals(new Rover(1, 2, "N"), rover);
    }


}