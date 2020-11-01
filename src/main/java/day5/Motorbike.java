package day5;

public class Motorbike {
    int issue_year;
    String colour;
    String model;

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
