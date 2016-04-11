package com.dodevjutsu.kata.marsrover.commands;

import com.dodevjutsu.kata.marsrover.Direction;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RotateRightShould {

    @Test
    public void when_pointing_north() throws Exception {
        assertThat(facing("N").right(), Is.is(facing("E")));
    }

    @Test
    public void when_pointing_west() throws Exception {
        assertThat(facing("W").right(), Is.is(facing("N")));
    }

    @Test
    public void when_pointing_south() throws Exception {
        assertThat(facing("S").right(), Is.is(facing("W")));
    }

    @Test
    public void when_pointing_east() throws Exception {
        assertThat(facing("E").right(), Is.is(facing("S")));
    }

    private Direction facing(String value) {
        return Direction.from(value);
    }
}