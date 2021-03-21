package day0;

import java.util.HashMap;
import java.util.Map;

//https://codingexplained.com/coding/java/enum-to-integer-and-integer-to-enum

public enum ShipType {
    OneDeck (1),
    TwoDecks (2),
    ThreeDecks (3),
    FourDecks (4);

     public  int value;
//    private static Map map = new HashMap<>();
//
     ShipType(int value) {this.value = value; }
//
//    static {
//        for (ShipType shipType : ShipType.values()) {
//            map.put(shipType.value, shipType);
//        }
//    }

    public static ShipType valueOf(int shipType){
        //return (ShipType) map.get(shipType);
        return values()[shipType-1];
    }

    public int getValue() {
        return value;
    }
}
