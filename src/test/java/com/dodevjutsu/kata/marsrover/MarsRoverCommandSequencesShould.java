package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static com.dodevjutsu.kata.marsrover.TestHelper.marsRoverAt;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MarsRoverCommandSequencesShould {

    @Test
    public void not_move_when_receiving_an_empty_command_sequence() throws Exception {
        final MarsRover rover = marsRoverAt(0, 0, "N");

        rover.receive("");

        assertThat(rover, is(marsRoverAt(0, 0, "N")));
    }

}
