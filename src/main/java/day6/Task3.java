package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher tch1 = new Teacher("Petrova", "Geography");
        Student st1 = new Student("Ivan");
        tch1.evaluate(st1);
        System.out.println("" + tch1.evaluate(st1));

    }
}
