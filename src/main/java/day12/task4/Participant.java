package day12.task4;

public class Participant {
    private String name;

    public Participant(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                '}';
    }

}
