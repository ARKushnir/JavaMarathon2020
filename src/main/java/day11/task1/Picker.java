package day11.task1;

public class Picker implements Worker{

    static boolean is_bonus;
    int salary=0;
    Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public Picker(Warehouse warehouse) {
        this.warehouse=warehouse;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public void doWork() {
        salary = salary + 80;
        warehouse.getCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders()==10000){
            salary=salary+70000;
            is_bonus = true;
        } else if (warehouse.getCountPickedOrders()<10000){
            System.out.println("Бонус пока недоступен");
        } else if (warehouse.getCountPickedOrders()>10000  & (is_bonus == true) ){
            System.out.println("Бонус уже был выплачен");
        }

    }
}
