package day8;

public class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    int fuel=0;

   public  Airplane(String producer, int year, int length, int weight ){
       this.producer=producer;
       this.year=year;
       this.length=length;
       this.weight=weight;

   }
    public String toString(){
       return " Изготовитель "+this.producer+" Год выпуска "+this.year+" Длина"+this.length+" Вес"+this.weight
                +" Кол-во топива в баке "+fuel;
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

    public void SetLength(int length){
       this.length=length;
    }
}
