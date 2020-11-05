package day9.Task2;

public abstract class Figure {

    public Figure(String color) {
        this.color = color;
    }

    String color;


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public abstract double area();
    public abstract double perimeter();

}
