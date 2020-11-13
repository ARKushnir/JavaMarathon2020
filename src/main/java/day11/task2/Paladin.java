package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack, MagicAttack{

    public Paladin() {
        super(100, 0.5, 0.2, 15, 0);
    }


    @Override
    public double healHimself() {
        return  health = health + 25;
    }

    @Override
    public void healTeammate(Hero hero) {
        health = health+10;

    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth()-(physAtt-(physAtt*hero.getPhysDef())));
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth()-(magicAtt-(magicAtt*hero.getMagDef())));
    }

    @Override
    public String toString() {
        return "Paladin{" +
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
