package com.thoughtworks.gameoflife;

import org.junit.Test;

import static org.junit.Assert.*;

public class GridTest {

    @Test
    public void shouldReturntheNumberOfALiveNeighbourACellHas() {
        Grid grid = new Grid();

        assertEquals(0, grid.noOfAliveNeighbour());
    }
}