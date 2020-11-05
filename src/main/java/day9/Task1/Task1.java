package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student st1 = new Student("Pavel", "MATH");
        st1.getName();

        Teacher tc1 = new Teacher("Tatiana", "Geography");
        tc1.getSubject();

        st1.printInfo();
        tc1.printInfo();

    }
}
