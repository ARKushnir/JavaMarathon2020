package day5;

import java.util.Calendar;

public class Car {
    int issue_year;
    String colour;
    String model;

    public void  SetDate(int car_issue_year) {
        issue_year= car_issue_year;
    }

    public int GetDate() {
        return issue_year;
    }

    public void SetColour (String car_color){
        colour=car_color;
    }

    public String GetColour(){
        return colour;
    }
    public void SetModel (String car_model){
        model=car_model;
    }

    public String GetModel(){
        return model;
    }

}


