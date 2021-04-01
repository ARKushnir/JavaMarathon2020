package day0;

import java.util.*;


public class Field {
    static final int  FIELD_SIZE=10;
    List<Ship> ships = new LinkedList<>();
    Map<Coordinate, Cell>  map = new HashMap<>();

    public Field() {
        for (int i=0; i<FIELD_SIZE; i++){
            for (int j=0; j<FIELD_SIZE; j++){
                map.put(new Coordinate(i, j), new Cell(CellType.Empty, null));
            }
        }
    }

    public void printField() {
        for (int i=0; i<FIELD_SIZE; i++){
            for (int j=0; j<FIELD_SIZE; j++){
                System.out.print(map.get(new Coordinate(i,j)));
            }
            System.out.println();
        }
    }


    public void add(Ship ship){
        //проврить что ячейки по координатам корабля пустые
        // если они пустые то мы помечаем ячейки - тип меняем на типа корабля
        // сохраняем ссылки на корабль
        // рисуем ореол
        // если ячейки не пустые - выбрасываем еррор
        for (Coordinate coordinate : ship.getCoordinates()){
            if (!(coordinate.getX()>=0 && coordinate.getX()<=9) ||
            !(coordinate.getY()>=0 && coordinate.getY()<=9)){
                throw new RuntimeException("Введены неправильные координаты");
            }
            Cell cell = map.get(coordinate);
            if (cell.type!=CellType.Empty) {
                throw new RuntimeException("Ячейка уже занята");
            } else {
                cell.type = CellType.Ship;
                cell.ship = ship;

            }
        }
        ships.add(ship);

        List<Coordinate>  oreolCd= new ArrayList<>();
        for (Coordinate coordinate : ship.getCoordinates()){

            if (coordinate.getX()-1>=0) {
                oreolCd.add(new Coordinate(coordinate.getX() - 1, coordinate.getY()));
            }

            if (coordinate.getX()+1!=FIELD_SIZE) {
                oreolCd.add(new Coordinate(coordinate.getX() + 1, coordinate.getY()));
            }

            if (coordinate.getY()+1!=FIELD_SIZE) {
                oreolCd.add(new Coordinate(coordinate.getX(), coordinate.getY() + 1));
            }

            if (coordinate.getY()-1>=0) {
                oreolCd.add(new Coordinate(coordinate.getX(), coordinate.getY() - 1));
            }

            if ((coordinate.getX()+1!=FIELD_SIZE) && (coordinate.getY()+1!=FIELD_SIZE)) {
            oreolCd.add(new Coordinate(coordinate.getX()+1, coordinate.getY()+1));
            }

            if ((coordinate.getX()-1>=0) && (coordinate.getY()-1>=0)){
                oreolCd.add(new Coordinate(coordinate.getX() - 1, coordinate.getY() - 1));
            }
           //
            if ((coordinate.getX()+1!=FIELD_SIZE) && (coordinate.getY()-1>=0)) {
                oreolCd.add(new Coordinate(coordinate.getX() + 1, coordinate.getY() - 1));
            }

            if ((coordinate.getX()-1>=0) && (coordinate.getY()+1!=FIELD_SIZE)) {
                oreolCd.add(new Coordinate(coordinate.getX() - 1, coordinate.getY() + 1));
            }

        }

        oreolCd.removeAll(ship.getCoordinates());

        for (Coordinate cd2 :oreolCd){
            Cell cell = map.get(cd2);
            if (cell.type!=CellType.Ship) {
                cell.type=CellType.Oreol; }
            else  {
                throw new RuntimeException("По соседству есть корабль");
            }
        }
    }

    public boolean shoot(Coordinate coordinate){
        boolean shFlag = false;
        Cell cell = map.get(coordinate);
        if (cell.type==CellType.Ship) {
            shFlag = true;
            cell.ship.shoot(coordinate);
            cell.type=CellType.Hit;
            if (cell.ship.isAlive())
            {
                System.out.println("Ранен");

            } else {
                System.out.println("Убит");
            }

        }
        else if (cell.type==CellType.Hit)
        {
            System.out.println("Уже попадал!");
            shFlag = false;
        } else { System.out.println("Мимо!");
            shFlag = false;}
        return shFlag ;
    }

    public boolean areShipsAlive(){
        for (Ship ship: ships){
            if (ship.isAlive()){
                return true;
            }
        }
        return false;
    }

}
