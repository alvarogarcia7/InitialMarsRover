package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DirectionTurnRightShould {

    @Test
    public void when_pointing_north() throws Exception {
        assertThat(facing("N").right(), is(facing("E")));
    }

    @Test
    public void when_pointing_west() throws Exception {
        assertThat(facing("W").right(), is(facing("N")));
    }

    @Test
    public void when_pointing_south() throws Exception {
        assertThat(facing("S").right(), is(facing("W")));
    }

    @Test
    public void when_pointing_east() throws Exception {
        assertThat(facing("E").right(), is(facing("S")));
    }

    private Direction facing(String value) {
        return Direction.from(value);
    }
}