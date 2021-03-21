package day0;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ship {

    private ShipType type;
    private  List<Coordinate> coordinates;
    private Set<Coordinate> shCoordinates;
    private final static int MAX_SHIP_SIZE=4;

    public Ship(ShipType type, List<Coordinate> coordinates, Set<Coordinate> shCoordinates) {
        this.type = type;
        this.coordinates = coordinates;
        this.shCoordinates = new HashSet<>();
        isValid ();
    }


    private  void isValid () {
        if (coordinates.size()>MAX_SHIP_SIZE) throw new RuntimeException("Превышен размер корабля");
        if (coordinates.size()==1) { return;  };
        if (coordinates.size()==0) throw new RuntimeException("Ничего не введено");

        for(int i =0; i< coordinates.size(); i++){
            if (!((coordinates.get(i).getX()+1)-(coordinates.get(i).getX())==1) ||
                !((coordinates.get(i).getY()+1)-(coordinates.get(i).getY())==1))
            {
                throw new RuntimeException("Координаты не последовательны");
            }
         }
    }

    public boolean isAlive() {
        return coordinates.size()!=shCoordinates.size();
    }

    public  void shoot (Coordinate coordinate)
    {
            shCoordinates.add(coordinate);
    }


    // добавить метод shoot в котором сделать add shCoordinates
    //shoot вызвать у ship но в field
    // isAlive() вызвать в field

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }
}
