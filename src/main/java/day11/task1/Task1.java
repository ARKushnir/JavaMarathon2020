package day11.task1;

import org.w3c.dom.ls.LSOutput;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Warehouse warehouse2 = new Warehouse();

        Picker p= new Picker( warehouse);
        Courier c = new Courier (warehouse);

        Picker p2= new Picker( warehouse2);
        Courier c2 = new Courier (warehouse2);

        p2.doWork();
        c2.doWork();

        businessProcess(p);
        businessProcess(c);

        System.out.println(warehouse.countPickedOrders);
        System.out.println(warehouse.countDeliveredOrders);

        System.out.println(p.salary);
        System.out.println(c.salary);
    }


        public static void businessProcess(Worker worker){
         for(int i=0 ;i<10000; i++){
             worker.doWork();
         }
         worker.bonus();
         worker.bonus();
        }}

