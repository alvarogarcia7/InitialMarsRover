package com.dodevjutsu.kata.marsrover;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

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

    @Test
    public void turn_left_pointing_north() throws Exception {
        assertThat(rover.receive("l"), is(new MarsRover(0, 1, "W")));
    }


    @Test
    public void turn_right_pointing_north() throws Exception {
        assertThat(rover.receive("r"), is(new MarsRover(0, 1, "E")));
    }

    @Test
    public void fail_when_a_command_is_not_known() throws Exception {
        Exception exception = null;
        try {
            rover.receive("*");
        } catch (Exception e) {
            exception = e;
        } finally {
            if(null == exception){
                fail("expected exception");
            }
        }
    }

}
