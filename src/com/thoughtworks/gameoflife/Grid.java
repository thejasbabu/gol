// Grid class represents the 2-D universe and contains square cell.
package com.thoughtworks.gameoflife;

import java.util.ArrayList;
import java.util.Objects;

public class Grid {

    ArrayList<Cell> cells;

    public Grid(ArrayList<Cell> cells) {
        this.cells = cells;
    }

    public int numberOfAliveNeighbour(Cell cell) {
        int numberOfNeighbour = 0;
        for(Cell thatCell : cells) {
            if(thatCell.stateOfCell().equals("Alive") && thatCell.neighbourOf(cell))
                numberOfNeighbour++;
        }
        return numberOfNeighbour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grid grid = (Grid) o;
        return !(cells != null ? !cells.equals(grid.cells) : grid.cells != null);

    }

    @Override
    public int hashCode() {
        return cells != null ? cells.hashCode() : 0;
    }

    public boolean aliveCheckForDeadCell(Cell cell) {
        return numberOfAliveNeighbour(cell) == 3;
    }

    public boolean deadCheckForAliveCell(Cell cell) {
        return numberOfAliveNeighbour(cell) > 3 || numberOfAliveNeighbour(cell) < 2;
    }
}
