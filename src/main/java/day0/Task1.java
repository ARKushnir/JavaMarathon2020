package day0;

import java.util.*;

import static day0.ShipType.*;

public class Task1 {

    private static String Cd_in;
    private int curIndex;
    private final static int PLAYERS_SIZE=2;

    public static void main(String[] args) {


        Field field = new Field();
        Field field2 = new Field();

        Scanner in = new Scanner(System.in);

        System.out.println("Первый игрок заполните поле");
        fillField(field, in);
        System.out.println("Второй игрок заполните поле");
        fillField(field2, in);

       // in.close();
        System.out.println("Поле 1-го игрока");
        field.printField();
        System.out.println("Поле 2-го игрока");
        field2.printField();

        Field fld;
        String step;

        boolean isUserOne = true;
        boolean shFlag = true;
        int next_step =0 ;

        while (field2.areShipsAlive() && field.areShipsAlive()) {
            do {
                System.out.println("Ход первого игрока");
                String shCell = in.nextLine();
                String[] string_sh = shCell.split(",");
                int x = Integer.parseInt(string_sh[0]);
                int y = Integer.parseInt(string_sh[1]);
                shFlag = field2.shoot(new Coordinate(x,y));
                //shFlag = shoot(field2, new Coordinate(x, y));
            } while (shFlag);
            do {
                System.out.println("Ход второго игрока");
                String shCell = in.nextLine();
                String[] string_sh = shCell.split(",");
                int x = Integer.parseInt(string_sh[0]);
                int y = Integer.parseInt(string_sh[1]);
                shFlag = field.shoot(new Coordinate(x, y));
            } while (shFlag);
        }
        if (field2.areShipsAlive() ) {
            System.out.println("Второй игрок победил ");
        }

    }



    static void  fillField(Field field, Scanner in){
       int cnt_pnt = 0; // X-еx палубный корабль
       int j;


       for (int cnt_shps = 1; cnt_shps < 2; cnt_shps++) {
           cnt_pnt = 5 - cnt_shps; //сколько кораблей

           j = 0;
           while (j < cnt_shps) {
               boolean isValid = false;
                while (!isValid) {
                    System.out.println("Введи координаты " + (j + 1) + "-го " + cnt_pnt + " -го корабля ");
                    Cd_in = in.nextLine();
                    String[] cds = Cd_in.split(";");
                    List<Coordinate> coordinates = new ArrayList<>();

                    for (String cd : cds) {
                        String[] string_cord = cd.split(",");
                        int x = Integer.parseInt(string_cord[0]);
                        int y = Integer.parseInt(string_cord[1]);
                        Coordinate cd1 = new Coordinate(x, y);
                        coordinates.add(cd1);
                    }

                    Ship sh1 = new Ship(ShipType.valueOf(cnt_pnt), coordinates, null);

                    try {
                        field.add(sh1);
                        isValid = true;
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
               j++;
           }
       }

   }

   private void nextStep(){
       curIndex++;
       if (curIndex >= PLAYERS_SIZE) {
           curIndex=0;
       }
   }



}