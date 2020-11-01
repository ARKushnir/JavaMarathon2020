package day6;

public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject){
        this.name=name;
        this.subject=subject;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {

        return this.name;
    }

    public void setSubject(String name){
        this.subject = subject;
    }
    public String getSubject() {

        return this.subject;
    }

    public String evaluate(Student st1){
        st1=new Student("Ivan");
        String chislo_rec = null; 
        double chislo = (int) (Math.random()*5);
         if (chislo==5) {
             chislo_rec="Отлично";
         }
          else if (chislo==4) {
             chislo_rec="Хорошо";
          }
         else if (chislo==3) {
             chislo_rec="Удовлетворительно";
         }
         else if (chislo==2) {
             chislo_rec="Неудовлетворительно";
         }
         else if (chislo==1) {
             chislo_rec="Очень плохо";
         }
         else if (chislo==0) {
             chislo_rec="Неправильная оценка";
         }

        //System.out.println("Преподователь "+ this.name+" оценил студента с именем "+st1.getNAme()+
          //     " по предмету "+ this.subject+ " на оценку "+ chislo_rec );
        return chislo_rec;

    }
}
