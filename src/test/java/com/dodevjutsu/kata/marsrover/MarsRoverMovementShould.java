package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MarsRoverMovementShould {
    @Test
    public void move_forward_pointing_north() throws Exception {
        assertThat(new MarsRover(0, 1, "N").receive("f"), is(new MarsRover(0, 2, "N")));
    }

    @Test
    public void move_forward_pointing_north_wide_range() throws Exception {
        for(int i=-1000; i<1000; i++) {
            assertThat(new MarsRover(0, i, "N").receive("f"), is(new MarsRover(0, i+1, "N")));
        }
    }
}
