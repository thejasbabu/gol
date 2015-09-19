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
}
