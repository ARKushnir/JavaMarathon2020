package day14;

public class Person {
    String name;
    int age;

    public Person(String name, Integer age) {
        this.name=name;
        if (age<0){
            throw new ArithmeticException ("Возраст не может быть меньше 0") ;
        }
         this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
