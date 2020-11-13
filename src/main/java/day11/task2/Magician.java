package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{

   public Magician() {
      super(100, 0, 0.8, 5, 20);
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
      return "Magician{" +
              "health=" + health +
              '}';
   }
}
