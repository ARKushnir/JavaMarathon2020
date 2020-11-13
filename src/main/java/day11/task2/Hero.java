package day11.task2;

public abstract class Hero {

    double health; //здоровье
    double physDef; //Защита Ф
    double magicDef; //Защита М
    int physAtt; //Атака Ф - велечина
    int magicAtt;// Атака М - велечина


    public Hero(double health, double physDef, double magicDef,int physAtt, int magicAtt ) {
        this.health = health;
        this.physDef=physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
        this.magicAtt = magicAtt;
    }

    public void setHealth(double health) {
        if (health<0) {
            this.health=0.0;
        }
        else {this.health = health; }
    }

    public abstract double getPhysDef();
    public abstract double getMagDef();
    public abstract double getHealth();
}
