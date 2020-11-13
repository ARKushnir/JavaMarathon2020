package day11.task2;

public class Task2 {
    public static void main(String[] args) {

        Warrior wr1 = new Warrior();
        Paladin pl1 = new Paladin();
        Shaman sh1 = new Shaman();
        Magician mg1 = new Magician();

        //Воин атакует Паладина
        wr1.physicalAttack(pl1);
        System.out.println(pl1);

        //Паладин атакует Мага
        pl1.physicalAttack(mg1);
        System.out.println(mg1);

        //Шаман лечит Мага
        sh1.healTeammate(mg1);
        System.out.println(mg1);

        //Маг атакует Паладина, тип атаки М
        mg1.magicalAttack(pl1);
        System.out.println(pl1);

        //Шаман атакует Воина, тип атаки Ф
        sh1.physicalAttack(wr1);
        System.out.println(wr1);

        pl1.healHimself();
        System.out.println(pl1);

        wr1.physicalAttack(mg1);
        System.out.println(mg1);

        wr1.physicalAttack(mg1);
        System.out.println(mg1);

        wr1.physicalAttack(mg1);
        System.out.println(mg1);

        wr1.physicalAttack(mg1);
        System.out.println(mg1);

        wr1.physicalAttack(mg1);
        System.out.println(mg1);

    }
}
