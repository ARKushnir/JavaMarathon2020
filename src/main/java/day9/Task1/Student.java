package day9.Task1;

public class Student extends Human{
    private String group;
    //private String name;

    public String getGroup() {
        return group;
    }


    public Student(String name, String group) {
        super(name);
        this.group = group;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем  "+name);

    }
}
