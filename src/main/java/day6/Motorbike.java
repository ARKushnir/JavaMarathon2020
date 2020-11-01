package day6;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Calendar;

public class Motorbike {
    int issue_year;
    String colour;
    String model;

    public Motorbike() {

    }
    // Вопрос - почему здесь понадобился конструктор ? В классе Car - без конструктора все заработало

    void info(){
        System.out.println("Это мотоцикл");
    }


    void yearDifference(int issue_year){
        //int year = Calendar.getInstance().get(Calendar.YEAR);
        int year = Year.now().getValue();
        int diff = year-issue_year;
        System.out.println(diff);
    }

        public Motorbike(int bike_issuer_year, String bike_colour, String bike_model){
            issue_year=bike_issuer_year;
            colour=bike_colour;
            model=bike_model;
        }

        public int getDate(){
            return issue_year;
        }

        public String getColor(){
             return colour;
        }

        public String getModel(){
            return model;
    }
    }
