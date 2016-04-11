package com.dodevjutsu.kata.marsrover;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MarsRoverMovementShould {

    private MarsRover rover;

    @Before
    public void setUp() throws Exception {
        rover = new MarsRover(0, 1, "N");
    }

    @Test
    public void move_forward_pointing_north() throws Exception {
        assertThat(rover.receive("f"), is(new MarsRover(0, 2, "N")));
    }

    @Test
    public void move_backward_pointing_north() throws Exception {
        assertThat(rover.receive("b"), is(new MarsRover(0, 0, "N")));
    }
}
