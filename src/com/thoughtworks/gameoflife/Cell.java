// Cell class represents the cell in an infinite 2-D grid.
package com.thoughtworks.gameoflife;

public class Cell {
    private int x;
    private int y;
    private boolean state;

    public Cell(int x, int y, boolean state) {
        this.x = x;
        this.y = y;
        this.state = state;
    }

    public String stateOfCell() {
        if(state)
            return "Alive";
        else
            return "Dead";
    }
}
