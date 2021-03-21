package day0;

import java.util.Objects;

public class Coordinate {
    int x;
    int y;
    boolean isAlive;

    public boolean isAlive(){
        return  isAlive;
    }

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
        this.isAlive = true;
    }

    public int getX() {
        return x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public int getY() {
        return y;
    }


}


