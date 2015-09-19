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
        if(this.row == thatCell.row && (this.column == thatCell.column - 1 || this.column == thatCell.column + 1))
            return true;
        else
            return false;
    }
}
