package day7;

public class Player {

    private int stamina ;
    final static int MAX_STAMINA=100;
    final static int MIN_STAMINA=0;
    public static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }


    public int getStamina() {
        return stamina;
    }
    public void run(){
        while (stamina>0){
            stamina--;
        }
        {
            System.out.println("Игрок выдохся");
            countPlayers--;
        }
    }

    public void info(){
        if (countPlayers<6) {
            System.out.println("Команды неполные. На поле еще есть" + (6- countPlayers) + " свободных мест");}
        else {
            System.out.println("На поле нет свободных мест");
        }
    }

    public void printNumberOfPlayers(){
        System.out.println("Number of players is "+ countPlayers);
    }

}
