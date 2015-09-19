// Grid class represents the 2-D universe and contains square cell.
package com.thoughtworks.gameoflife;

import java.util.ArrayList;

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

    public boolean aliveCheckForDeadCell(Cell cell) {
        return numberOfAliveNeighbour(cell) == 3;
    }

    public boolean deadCheckForAliveCell(Cell cell) {
        return numberOfAliveNeighbour(cell) > 3 || numberOfAliveNeighbour(cell) < 2;
    }
}
