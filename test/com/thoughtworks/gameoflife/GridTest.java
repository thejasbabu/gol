package com.thoughtworks.gameoflife;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GridTest {

    @Test
    public void shouldReturnTheNumberOfALiveNeighbourACellHas() {
        ArrayList<Cell> cells = new ArrayList<Cell>();
        cells.add(new Cell(1, 1, true));
        cells.add(new Cell(1, 2, true));
        cells.add(new Cell(2, 1, false));
        cells.add(new Cell(2, 2, true));
        cells.add(new Cell(3, 1, true));
        Grid grid = new Grid(cells);

        Cell cell = new Cell(1, 1, true);
        assertEquals(2, grid.numberOfAliveNeighbour(cell));
    }

    @Test
    public void shouldReturnTheNumberOfDeadNeighbourACellHas() {
        ArrayList<Cell> cells = new ArrayList<Cell>();
        cells.add(new Cell(1, 1, true));
        cells.add(new Cell(1, 2, false));
        cells.add(new Cell(2, 1, false));
        cells.add(new Cell(2, 2, true));
        cells.add(new Cell(3, 1, true));
        Grid grid = new Grid(cells);

        Cell cell = new Cell(1, 1, true);
        assertEquals(2, grid.numberOfDeadNeighbour(cell));
    }
}