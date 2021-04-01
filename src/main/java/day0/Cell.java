package day0;

public class Cell {
    CellType type;
    Ship ship;
    // попал - не попал
    //Coordinate coordinate;

    public Cell(CellType type, Ship ship) {
        this.type = type;
        this.ship = ship;
    }

    @Override
    public String toString() {
        return "  " +
                 + type.getValue() +
                "  ";
    }

    public Ship getShip() {
        return ship;
    }


}
