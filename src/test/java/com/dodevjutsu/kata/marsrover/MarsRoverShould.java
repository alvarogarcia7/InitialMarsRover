package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MarsRoverShould {

    @Test
    public void not_move_when_receiving_an_empty_command_sequence() throws Exception {
        final MarsRover rover = marsRoverAt(0, 0, "N");

        rover.receive("");

        assertThat(rover, is(marsRoverAt(0, 0, "N")));
    }

    @Test
    public void moving_forward_when_facing_north() throws Exception {
        final MarsRover rover = marsRoverAt(0, 0, "N");

        rover.receive("f");

        assertThat(rover, is(marsRoverAt(0, 1, "N")));
    }

    private MarsRover marsRoverAt(int x, int y, String direction) {
        return new MarsRover(x, y, direction);
    }


}
