package com.thoughtworks.gameoflife;

import org.junit.Test;
import static org.junit.Assert.*;

public class CellTest {

    @Test
    public void shouldReturnTheStateOfCellAsAlive() {
        Cell cell = new Cell(1, 2, true);

        assertEquals("Alive", cell.stateOfCell());
    }

    @Test
    public void shouldReturnTheStateOfTheCellAsDead() {
        Cell cell = new Cell(1, 2, false);

        assertEquals("Dead", cell.stateOfCell());
    }

    @Test
    public void shouldReturnTrueIfACellIsANeighbourOfAnotherCell() {
        Cell cellOne = new Cell(1, 2, true);
        Cell cellTwo = new Cell(1, 3, true);

        assertEquals(true, cellOne.neighbourOf(cellTwo));
    }

    @Test
    public void shouldReturnFalseIfACellIsNotANeighbourOfAnotherCell() {
        Cell cellOne = new Cell(1, 2, true);
        Cell cellTwo = new Cell(1, 4, true);

        assertEquals(false, cellOne.neighbourOf(cellTwo));
    }

    @Test
    public void shouldReturnTrueIfACellIsANeighbourOfAnotherCellVertically() {
        Cell cellOne = new Cell(2, 2, true);
        Cell cellTwo = new Cell(1, 2, true);

        assertEquals(true, cellOne.neighbourOf(cellTwo));
    }

    @Test
    public void shouldReturnFalseIfACellIsNotANeighbourOfAnotherCellVertically() {
        Cell cellOne = new Cell(1, 2, true);
        Cell cellTwo = new Cell(2, 3, true);

        assertEquals(false, cellOne.neighbourOf(cellTwo));
    }

    @Test
    public void shouldReturnTrueIfACellIsNeighbourOfAnotherCellDiagonallyRight() {
        Cell cellOne = new Cell(2, 2, true);
        Cell cellTwo = new Cell(1, 3, true);

        assertEquals(true, cellOne.neighbourOf(cellTwo));
    }

    @Test
    public void shouldReturnTrueIfACellIsNeightbourOfAnotherCellDiagonallyTopLeft() {
        Cell cellOne = new Cell(2, 2, true);
        Cell cellTwo = new Cell(1, 1, true);

        assertEquals(true, cellOne.neighbourOf(cellTwo));
    }
}
