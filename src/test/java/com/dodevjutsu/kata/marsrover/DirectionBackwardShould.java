package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DirectionBackwardShould {

    @Test
    public void when_facing_north() throws Exception {
        assertThat(actFacing("N"), is(delta(0, -1)));
    }

    private Delta actFacing(String n) {
        return Direction.from(n).backward();
    }

    private Delta delta(int x, int y) {
        return new Delta(x, y);
    }


}