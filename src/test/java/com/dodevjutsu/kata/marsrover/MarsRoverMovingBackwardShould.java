package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static com.dodevjutsu.kata.marsrover.TestHelper.marsRoverAt;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MarsRoverMovingBackwardShould {

    @Test
    public void when_facing_north() throws Exception {
        final MarsRover rover = marsRoverAt(0, 4, "N");

        rover.receive("b");

        assertThat(rover, is(marsRoverAt(0, 3, "N")));
    }


    @Test
    public void when_facing_east() throws Exception {
        final MarsRover rover = marsRoverAt(0, 0, "E");

        rover.receive("b");

        assertThat(rover, is(marsRoverAt(-1, 0, "E")));
    }
}
