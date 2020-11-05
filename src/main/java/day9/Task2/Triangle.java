package day9.Task2;

import static java.lang.StrictMath.sqrt;

public class Triangle extends Figure{
    int a;
    int b;
    int c ;
    double p;

    public Triangle(int a, int b, int c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double area() {
        p=0.5*(a+b+c);
        return sqrt(0.5*p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }
}
