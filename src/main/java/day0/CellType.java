package day0;

public enum CellType {

    Empty (0),
    Oreol (-1),
    Ship (1),
    Hit (2) ;

    public int getValue() {
        return value;
    }

    public int value ;

    CellType(int value) {
        this.value = value;
    }
}
