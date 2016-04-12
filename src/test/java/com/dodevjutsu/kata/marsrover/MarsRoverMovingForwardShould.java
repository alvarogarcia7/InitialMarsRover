package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static com.dodevjutsu.kata.marsrover.TestHelper.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MarsRoverMovingForwardShould {

    @Test
    public void when_facing_north() throws Exception {
        final MarsRover rover = marsRoverAt(0, 4, "N");

        rover.receive("f");

        assertThat(rover, is(marsRoverAt(0, 5, "N")));
    }


    @Test
    public void when_facing_east() throws Exception {
        final MarsRover rover = marsRoverAt(3, 3, "E");

        rover.receive("f");

        assertThat(rover, is(marsRoverAt(4, 3, "E")));
    }

    @Test
    public void when_facing_south() throws Exception {
        final MarsRover rover = marsRoverAt(9, 9, "S");

        rover.receive("f");

        assertThat(rover, is(marsRoverAt(9, 8, "S")));
    }


    @Test
    public void when_facing_west() throws Exception {
        final MarsRover rover = marsRoverAt(4,1, "W");

        rover.receive("f");

        assertThat(rover, is(marsRoverAt(3, 1, "W")));
    }

}
