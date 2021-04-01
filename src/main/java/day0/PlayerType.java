package day0;

public enum PlayerType {
    First ("Первого"),
    Second ("Второго");

    public String title;

    PlayerType(String title) {
        this.title=title;
    }

    public String getTitle(){
        return title;
    }
}
