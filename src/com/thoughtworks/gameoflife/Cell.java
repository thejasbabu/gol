// Cell class represents the cell in an infinite 2-D grid.
package com.thoughtworks.gameoflife;

public class Cell {
    private int row;
    private int column;
    private boolean state;

    public Cell(int row, int column, boolean state) {
        this.row = row;
        this.column = column;
        this.state = state;
    }

    public String stateOfCell() {
        if(state)
            return "Alive";
        else
            return "Dead";
    }

    public boolean neighbourOf(Cell thatCell) {
        if(horizontalNeighbour(thatCell))
            return true;
        else if(verticalNeighbour(thatCell))
            return true;
        else
            return false;
    }

    private boolean horizontalNeighbour(Cell thatCell) {
        return this.row == thatCell.row && (this.column == thatCell.column - 1 || this.column == thatCell.column + 1);
    }

    private boolean verticalNeighbour(Cell thatCell) {
        return this.column == thatCell.column && (this.row == thatCell.row - 1 || this.row == thatCell.row + 1);
    }
}
