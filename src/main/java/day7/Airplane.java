package day7;

public class Airplane {
    String producer;
    int year;
    int length;
    String weight;
    int fuel=0;


   public Airplane(String producer, int year, int length, String weight ){
       this.producer=producer;
       this.year=year;
       this.length=length;
       this.weight=weight;

   }
    public int getFuel(){
        return fuel;
    }

    public int getLength() { return length; }

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

    public void SetLength(int  length){
       this.length=length;
    }

    public static  void compareAirline(day7.Airplane air1, day7.Airplane air2) {

       if (air1.getLength()<air2.getLength()) {
           System.out.println("Длина 1-го самолета меньше");}
           else {
               System.out.println("Длина 1-го самолета больше");
           }
       }

    }
