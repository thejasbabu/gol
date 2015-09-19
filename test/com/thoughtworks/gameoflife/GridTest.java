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
    public void shouldReturnTrueWhenDeadCellIsSurroundedByExactlyThreeAliveCells() {
        ArrayList<Cell> cells = new ArrayList<Cell>();
        cells.add(new Cell(1, 1, false));
        cells.add(new Cell(1, 2, true));
        cells.add(new Cell(2, 1, true));
        cells.add(new Cell(2, 2, true));

        Grid grid = new Grid(cells);

        assertEquals(true, grid.aliveCheckForDeadCell(new Cell(1, 1, false)));
    }

    @Test
    public void shouldReturnTrueWhenAliveCellIsSurroundedByMoreThanThreeAliveCells() {
        ArrayList<Cell> cells = new ArrayList<Cell>();
        cells.add(new Cell(1, 1, true));
        cells.add(new Cell(1, 2, true));
        cells.add(new Cell(2, 1, true));
        cells.add(new Cell(2, 2, true));
        cells.add(new Cell(3, 1, true));
        cells.add(new Cell(3, 2, true));

        Grid grid = new Grid(cells);

        assertEquals(true, grid.deadCheckForAliveCell(new Cell(2, 1, true)));
    }

    @Test
    public void shouldReturnTrueIfTwoGridsHaveSameCells() {
        ArrayList<Cell> cells = new ArrayList<Cell>();
        cells.add(new Cell(1, 1, true));
        cells.add(new Cell(1, 2, true));
        cells.add(new Cell(2, 1, true));
        cells.add(new Cell(2, 2, true));
        cells.add(new Cell(3, 1, true));
        cells.add(new Cell(3, 2, true));

        Grid gridOne = new Grid(cells);
        Grid gridTwo = new Grid(cells);

        assertEquals(gridOne, gridTwo);
    }

    @Test
    public void shouldReturnFalseIfTwoGridsHaveDifferentCells() {
        ArrayList<Cell> cells = new ArrayList<Cell>();
        cells.add(new Cell(1, 1, true));
        cells.add(new Cell(1, 2, true));
        cells.add(new Cell(2, 1, true));
        cells.add(new Cell(2, 2, true));
        ArrayList<Cell> cellsTwo = new ArrayList<Cell>();
        cellsTwo.add(new Cell(2, 1, true));
        cellsTwo.add(new Cell(2, 2, true));
        Grid gridOne = new Grid(cells);
        Grid gridTwo = new Grid(cellsTwo);

        assertNotEquals(gridOne, gridTwo);
    }

    @Test
    public void shouldHaveTheSameHashIfTwoGridsAreEqual() {
        ArrayList<Cell> cells = new ArrayList<Cell>();
        cells.add(new Cell(1, 1, true));
        cells.add(new Cell(1, 2, true));
        cells.add(new Cell(2, 1, true));
        cells.add(new Cell(2, 2, true));
        cells.add(new Cell(3, 1, true));
        cells.add(new Cell(3, 2, true));

        Grid gridOne = new Grid(cells);
        Grid gridTwo = new Grid(cells);

        assertEquals(gridOne.hashCode(), gridTwo.hashCode());
    }

    @Test
    public void shouldChangeTheAliveCellsToDeadAndDeadCellsToAliveDependingOnTheThreeCondition() {
        ArrayList<Cell> cells = new ArrayList<Cell>();
        cells.add(new Cell(1, 1, false));
        cells.add(new Cell(1, 2, true));
        cells.add(new Cell(2, 1, true));
        cells.add(new Cell(2, 2, true));
        Grid gridOne = new Grid(cells);
        ArrayList<Cell> cellsTwo = new ArrayList<Cell>();
        cellsTwo.add(new Cell(1, 1, true));
        cellsTwo.add(new Cell(1, 2, true));
        cellsTwo.add(new Cell(2, 1, true));
        cellsTwo.add(new Cell(2, 2, true));
        Grid gridTwo = new Grid(cellsTwo);

        gridOne.deadOrAlive();

        assertEquals(true, gridOne.equals(gridTwo));
    }
}