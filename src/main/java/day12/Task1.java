package day12;

import day12.task5.Car;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>() ;

        carList.add(new Car("BMW"));
        carList.add(new Car("Audio"));
        carList.add(new Car("Lamborgini"));
        carList.add(new Car("Tesla"));
        carList.add(new Car("Toyota"));

        for (Car car : carList) {
            System.out.println(car.getName());
        }
        carList.add(carList.size()/2, new Car("LADA4x4"));
        carList.remove(0);

        for (Car car : carList) {
            System.out.println(car.getName());
    }
}}
