package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane air1= new Airplane("BOEING", 1988, "125", "50");
        air1.info();
        Airplane air2= new Airplane("AIRBUS", 2005, "1255", "400");

        air2.fillUp(50);
        air2.fillUp(100);
        air2.SetLength("1256");
        air2.SetYear(2006);
        air2.info();


    }
}
