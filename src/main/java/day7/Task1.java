package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane air1= new Airplane("BOEING", 1988, 35, "50");
        Airplane air2= new Airplane("BOEING", 1988, 38, "50");
        Airplane.compareAirline(air1, air2);

    }
}