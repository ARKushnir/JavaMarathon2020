package day6;

import org.hibernate.property.access.internal.PropertyAccessStrategyIndexBackRefImpl;

public class Airplane {
    String producer;
    int year;
    String length;
    String weight;
    int fuel=0;

   public Airplane(String producer, int year, String length, String weight ){
       this.producer=producer;
       this.year=year;
       this.length=length;
       this.weight=weight;

   }
    public int getFuel(){
        return fuel;
    }

    public void info(){
        System.out.println(" Изготовитель "+this.producer+" Год выпуска "+this.year+" Длина"+this.length+" Вес"+this.weight
        +" Кол-во топива в баке "+fuel);
    }

    public void fillUp(int count){
       this.fuel=count;
        System.out.println("Самолет был заправлен на "+ this.fuel);
    }

    public void SetYear(int year){
       this.year=year;
    }

    public void SetLength(String  length){
       this.length=length;
    }
}
