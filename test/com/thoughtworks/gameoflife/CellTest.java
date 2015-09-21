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
        Cell cellTwo = new Cell(3, 3, true);

        assertEquals(false, cellOne.neighbourOf(cellTwo));
    }

    @Test
    public void shouldReturnTrueIfACellIsNeighbourOfAnotherCellDiagonallyTopRight() {
        Cell cellOne = new Cell(2, 2, true);
        Cell cellTwo = new Cell(1, 3, true);

        assertEquals(true, cellOne.neighbourOf(cellTwo));
    }

    @Test
    public void shouldReturnTrueIfACellIsNeighbourOfAnotherCellDiagonallyTopLeft() {
        Cell cellOne = new Cell(2, 2, true);
        Cell cellTwo = new Cell(1, 1, true);

        assertEquals(true, cellOne.neighbourOf(cellTwo));
    }

    @Test
    public void shouldReturnTrueIfACellIsNeighbourOfAnotherCellDiagnoallyBottomRight() {
        Cell cellOne = new Cell(1, 3, true);
        Cell cellTwo = new Cell(2, 2, true);

        assertEquals(true, cellOne.neighbourOf(cellTwo));
    }

    @Test
    public void shouldReturnTrueIfACellIsNeighbourOfAnotherCellDiagonallyBottomLeft() {
        Cell cellOne = new Cell(1, 1, true);
        Cell cellTwo = new Cell(2, 2, true);

        assertEquals(true, cellOne.neighbourOf(cellTwo));
    }

    @Test
    public void shouldReturnFalseWhenCellIsNotANieghbourVerticallyHorizonatllyAndDiagonally() {
        Cell cellOne = new Cell(1, 1, true);
        Cell cellTwo = new Cell(1, 4, true);

        assertEquals(false, cellOne.neighbourOf(cellTwo));
    }

    @Test
    public void shouldBeEqualToAnotherCellWithSameValues() {
        Cell cellOne = new Cell(1, 1, true);
        Cell cellTwo = new Cell(1, 1, true);

        assertEquals(cellOne, cellTwo);
    }

    @Test
    public void shouldNotBeEqualToAnotherCellWithDifferentValues() {
        Cell cellOne = new Cell(1, 1, true);
        Cell cellTwo = new Cell(1, 1, false);

        assertNotEquals(cellOne, cellTwo);
    }

    @Test
    public void shouldHaveSameHashCode() {
        Cell cellOne = new Cell(1, 1, true);
        Cell cellTwo = new Cell(1, 1, true);

        assertEquals(cellOne.hashCode(), cellTwo.hashCode());
    }

    @Test
    public void shouldChangeTheStateOfCell() {
        Cell cellOne = new Cell(1, 1, true);
        Cell cellTwo = new Cell(1, 1, false);

        cellOne.changeState();

        assertEquals(cellOne, cellTwo);
    }
}
