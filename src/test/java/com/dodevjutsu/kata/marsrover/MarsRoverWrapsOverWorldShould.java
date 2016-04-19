package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static com.dodevjutsu.kata.marsrover.TestHelper.marsRoverAt;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MarsRoverWrapsOverWorldShould {

    @Test
    public void does_not_move_when_the_world_is_1_by_1() throws Exception {
        final MarsRover rover = marsRoverAt(0, 0, "N", new WrappingWorld(1, 1));

        rover.receive("f");

        assertThat(rover, is(marsRoverAt(0, 0, "N")));
    }
}
