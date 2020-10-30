package day5;

import java.util.Calendar;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.SetDate(1988);
        car1.SetModel("Lada");
        car1.SetColour("Car");
        System.out.println("Дата выпуска "+car1.GetDate());
        System.out.println("Модель "+car1.GetModel());
        System.out.println("Цвет "+car1.GetColour());


    }
}
