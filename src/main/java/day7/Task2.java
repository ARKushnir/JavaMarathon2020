package day7;

public class Task2 {
    public static void main(String[] args) {
        Player pl1 = new Player(90);
        pl1.info();
        Player pl2 = new Player(92);
        pl2.info();
        Player pl3 = new Player(94);
        pl3.info();
        Player pl4 = new Player(96);
        pl4.info();
        Player pl5 = new Player(98);
        pl5.info();
        Player pl6 = new Player(100);
        pl6.info();

        Player pl7 = new Player(100);
        pl7.info();
        Player pl8 = new Player(90);
        pl8.info();

        pl8.run();
        pl8.printNumberOfPlayers();
    }
}
