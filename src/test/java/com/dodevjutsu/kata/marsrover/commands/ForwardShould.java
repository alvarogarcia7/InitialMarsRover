package com.dodevjutsu.kata.marsrover.commands;

import com.dodevjutsu.kata.marsrover.Delta;
import com.dodevjutsu.kata.marsrover.Direction;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ForwardShould {

    @Test
    public void when_facing_north() throws Exception {
        assertThat(actFacing("N"), Is.is(delta(0, 1)));
    }

    @Test
    public void when_facing_east() throws Exception {
        assertThat(actFacing("E"), Is.is(delta(1, 0)));
    }


    @Test
    public void when_facing_south() throws Exception {
        assertThat(actFacing("S"), Is.is(delta(0, -1)));
    }

    @Test
    public void when_facing_west() throws Exception {
        assertThat(actFacing("W"), Is.is(delta(-1, 0)));
    }

    private Delta actFacing(String n) {
        return Direction.from(n).forward();
    }

    private Delta delta(int x, int y) {
        return new Delta(x, y);
    }


}