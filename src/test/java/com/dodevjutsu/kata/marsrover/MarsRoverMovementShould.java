package com.dodevjutsu.kata.marsrover;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.verify;

public class MarsRoverMovementShould {

    private MarsRover rover;

    @Before
    public void setUp() throws Exception {
        rover = roverPointingAt(0, 1).facing("N").build();
    }

    @Test
    public void move_forward_pointing_north() throws Exception {
        final int x = 0;
        final int y = 2;
        final String n = "N";

        assertThat(rover.receive("f"), is(roverPointingAt(x, y).facing(n).build()));
    }

    @Test
    public void move_backward_pointing_north() throws Exception {
        assertThat(rover.receive("b"), is(roverPointingAt(0, 0).facing("N").build()));
    }

    @Test
    public void move_forward_pointing_south() throws Exception {
        assertThat(roverPointingAt(0, 0).facing("S").build().receive("f"), is(roverPointingAt(0, -1).facing("S").build()));
    }

    @Test
    public void turn_left_pointing_north() throws Exception {
        assertThat(rover.receive("l"), is(roverPointingAt(0, 1).facing("W").build()));
    }

    @Test
    public void turn_right_pointing_north() throws Exception {
        assertThat(rover.receive("r"), is(roverPointingAt(0, 1).facing("E").build()));
    }

    @Test
    public void turn_left_pointing_west() throws Exception {
        final MarsRoverBuilder rover = roverPointingAt(0, 1);
        assertThat(rover.facing("W").build().receive("l"), is(rover.facing("S").build()));
    }

    @Test
    public void turn_left_in_any_case() throws Exception {
        final Direction direction = Mockito.mock(Direction.class);
        MarsRover rover = new MarsRover(null, direction, new CommandParser());

        rover.receive("l");

        verify(direction).left();
    }

    @Test
    public void turn_right_in_any_case() throws Exception {
        final Direction direction = Mockito.mock(Direction.class);
        MarsRover rover = new MarsRover(null, direction, new CommandParser());

        rover.receive("r");

        verify(direction).right();
    }

    @Test
    public void backward_in_any_case() throws Exception {
        final Direction direction = Mockito.mock(Direction.class);
        MarsRover rover = new MarsRover(Mockito.mock(Point.class), direction, new CommandParser());

        rover.receive("b");

        verify(direction).backward();
    }


    @Test
    public void forward_in_any_case() throws Exception {
        final Direction direction = Mockito.mock(Direction.class);
        MarsRover rover = new MarsRover(Mockito.mock(Point.class), direction, new CommandParser());

        rover.receive("f");

        verify(direction).forward();
    }

    @Test
    public void split_commands_in_several() throws Exception {
        String commands = "l";
        CommandParser splitter = Mockito.mock(CommandParser.class);
        MarsRover rover = new MarsRover(null, Mockito.mock(Direction.class), splitter);

        rover.receive(commands);

        verify(splitter).split(commands);
    }


    @Test
    public void fail_when_a_command_is_not_known() throws Exception {
        Exception exception = null;
        try {
            rover.receive("*");
        } catch (Exception e) {
            exception = e;
        } finally {
            if (null == exception) {
                fail("expected exception");
            }
        }
    }

    private MarsRoverBuilder roverPointingAt(int x, int y) {
        return MarsRoverBuilder.aNew().at(new Point(x, y));
    }

}
