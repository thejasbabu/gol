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

}
