package day0;

public class Player {
    PlayerType type;
    Field field;

    public Player (PlayerType  type, Field field) {
        this.type = type;
        this.field = field;
    }

    @Override
    public String toString() {
        return type.getTitle();
    }

}
