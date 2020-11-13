package day11.task2;

public class Warrior extends Hero implements PhysAttack{

    public Warrior() {
        super(100, 0.8, 0, 30, 0);
    }

    @Override
    public void physicalAttack(Hero hero) {
       hero.setHealth(hero.getHealth()-(physAtt-(physAtt*hero.getPhysDef())));
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }

    @Override
    public double getPhysDef() {
        return physDef;
    }

    @Override
    public double getMagDef() {
        return magicDef;
    }

    @Override
    public double getHealth() {
        return health;
    }

}
