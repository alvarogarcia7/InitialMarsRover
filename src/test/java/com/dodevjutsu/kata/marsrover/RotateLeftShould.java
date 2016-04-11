package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RotateLeftShould {

    @Test
    public void when_pointing_north() throws Exception {
        assertThat(facing("N").left(), is(facing("W")));
    }

    @Test
    public void when_pointing_west() throws Exception {
        assertThat(facing("W").left(), is(facing("S")));
    }

    @Test
    public void when_pointing_south() throws Exception {
        assertThat(facing("S").left(), is(facing("E")));
    }


    @Test
    public void when_pointing_east() throws Exception {
        assertThat(facing("E").left(), is(facing("N")));
    }

    private Direction facing(String value) {
        return Direction.from(value);
    }
}