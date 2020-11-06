package day11.task1;

public class Courier implements Worker {

   boolean is_bonus;
   int  salary=0;
   Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse=warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }


    @Override
    public void doWork() {
        salary = salary + 100;
        warehouse.getCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders()==10000){
            salary=salary+50000;
            is_bonus = true;
        } else if  (warehouse.getCountDeliveredOrders()<10000) {
            System.out.println("Бонус пока недоступен");
        } else if (warehouse.getCountDeliveredOrders()>10000  & (is_bonus == true) ){
            System.out.println("Бонус уже был выплачен");
        }


    }
}
