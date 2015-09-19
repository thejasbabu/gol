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

    public void changeState() {
        this.state = !this.state;
    }

    @Override
    public boolean equals(Object thatCell) {
        if (this == thatCell) return true;
        if (thatCell == null || getClass() != thatCell.getClass()) return false;
        Cell cell = (Cell) thatCell;
        if (row != cell.row) return false;
        if (column != cell.column) return false;
        return state == cell.state;

    }

    @Override
    public int hashCode() {
        int result = row;
        result = 31 * result + column;
        result = 31 * result + (state ? 1 : 0);
        return result;
    }

    public String stateOfCell() {
        if(state)
            return "Alive";
        else
            return "Dead";
    }

    public boolean neighbourOf(Cell thatCell) {
        if(horizontalNeighbour(thatCell) || verticalNeighbour(thatCell) || diagonalRight(thatCell) || diagonalLeft(thatCell) || thatCell.diagonalRight(this) || thatCell.diagonalLeft(this))
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

    private boolean diagonalRight(Cell thatCell) {
        return this.row - 1 == thatCell.row && this.column + 1 == thatCell.column;
    }

    private boolean diagonalLeft(Cell thatCell) {
        return this.row - 1 == thatCell.row && this.column - 1 == thatCell.column;
    }
}
