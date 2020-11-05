package day9.Task2;

public class Circle extends Figure{
    int r ;

    public Circle(int r, String color) {
        super(color);
        this.r = r;
    }


    @Override
    public double area() {
        return 3.14*r*r;
    }

    @Override
    public double perimeter() {
        return 0;
}
}
