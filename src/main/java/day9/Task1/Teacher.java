package day9.Task1;

public class Teacher extends Human{

    private String subject;
    //private String name;

    public String getSubject() {
        return subject;
    }


    public Teacher(String name, String subject) {
        super(name);
        this.subject=subject;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподователь с именем  " + name);

    }
}
