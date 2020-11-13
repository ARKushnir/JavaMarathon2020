package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack{

    public Shaman() {
        super(100, 0.2, 0.2, 10, 15);
    }

    @Override
    public double healHimself() {
       return health = health + 50;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() + 30>100.0) {
            hero.health = 100;
        }
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


    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
